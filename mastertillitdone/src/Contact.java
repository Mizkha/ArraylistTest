public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name,  String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;

    }

    public Contact generateContact(String name , String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}
