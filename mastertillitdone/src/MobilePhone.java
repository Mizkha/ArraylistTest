import java.util.ArrayList;

public class MobilePhone {

    private String name;
    private ArrayList<Contact> Contacts= new ArrayList<>();

    public MobilePhone(String name){
        this.name=name;
        this.Contacts= new ArrayList<>();
    }

    private int findContact(Contact contact){
       return Contacts.indexOf(contact);
    }



    private int  findContact(String name){
        for(int i=0; i<Contacts.size();i++)
        {
            Contact compared = this.Contacts.get(i);
            if(compared.getName().equals(name))
            {
                int found= i;
                return found;
            }


        }
        return -1;
    }

    public boolean addContact(String name, String phoneNumber){
        int index = findContact(name);
        if(index>=0)
        {
            System.out.println("the name is already in the list");
            return false;
        }

        Contact newContact = new Contact(name,phoneNumber);
        Contacts.add(newContact);
        System.out.println("new contact was added");
        return true;

    }


    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);
        if(index==-1)
        {
            System.out.println("The contact you want to updated wasn't found");
            return false;
        }

        Contacts.set(index,newContact);
        System.out.println("You replaced "+ oldContact.getName() +" with " + newContact.getName());
        return true;

    }


    public boolean removeContact(String name){
        int index = findContact(name);
        if(index==-1)
        {
            System.out.println("The contact you want to delete doesn't exist");
            return false;
        }
        String deletedName =  Contacts.get(index).getName();
        Contacts.remove(index);
        System.out.println("the contact "+ deletedName +" was deleted");
        return true;
    }
//
//
    public void printAllContact(){
        System.out.println("The list of contacts");
        for(int i = 0; i<Contacts.size();i++)
        {
            System.out.println(i+". "+Contacts.get(i).getName()+"  : "+Contacts.get(i).getPhoneNumber());
        }
    }

//
    public boolean searchContact(String name){
        int index = findContact(name);
        if(index==-1)
        {
            System.out.println("The contact wasnt found");
            return false;
        }
        System.out.println("found "+ index + ".  "+ Contacts.get(index).getName()+ " "+ Contacts.get(index).getPhoneNumber() );
        return true;

    }
}
