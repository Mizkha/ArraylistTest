import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean quit = false;

        while (!quit)
        {
            System.out.println("");
            printActions();
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input)
            {
                case 1:
                    addNewContact();
                    break;

                case 2:
                    updateContact();
                    break;

                case 3:
                    removeContact();
                    break;

                case 4:
                    printContact();
                    break;

                case 5:
                    searchContact();
                    break;

                case 0:
                    quit=true;
                    System.out.println("Shutting down");
                    break;



            }
        }



    }
    public static MobilePhone mobilePhone = new MobilePhone("him");
    public static Scanner scanner = new Scanner (System.in);

    public static void addNewContact(){
        System.out.println("Input the contact name");
        String name = scanner.nextLine();
        System.out.println("Input the phone number");
        String phoneNumber = scanner.nextLine();
        if(mobilePhone.addContact(name, phoneNumber))
        {
            System.out.println("success");
        }
        else
            System.out.println("something went wrong");
    }

    public static void updateContact(){

        System.out.println("Input the contact name you want to update");
        String name = scanner.nextLine();
        System.out.println("Input the phone number you want to update");
        String phoneNumber = scanner.nextLine();

        System.out.println("Input the contact name");
        String updatedName = scanner.nextLine();
        System.out.println("Input the phone number");
        String updatedPhoneNumber = scanner.nextLine();
        Contact oldContact = new Contact(name,phoneNumber);
        Contact updatedContact = new Contact(updatedName,updatedPhoneNumber);

        if(mobilePhone.updateContact(oldContact,updatedContact))
        {
            System.out.println("success");
        }
        else
            System.out.println("error");
    }

    public static void removeContact(){
        System.out.println("Input the contact name you want to delete ");
        String name = scanner.nextLine();
        if(mobilePhone.removeContact(name))
        {
            System.out.println("success");
        }
        else
            System.out.println("error");

    }

    public static void printContact(){
        mobilePhone.printAllContact();
    }

    public static void searchContact(){
        System.out.println("Input the name of a contact you want to find");
        String name = scanner.nextLine();
        if(mobilePhone.searchContact(name))
        {
            System.out.println("success");
        }
        else
            System.out.println("error");
    }

    public static void printActions(){
        System.out.println(" 1 - to add a new contact \n"+
                            "2 - update the contact \n"+
                            "3 - to remove the contact \n"+
                            "4 - print all contacts \n" +
                            "5 - search a contact \n"+
                            "0 - to exit ");
    }

}
