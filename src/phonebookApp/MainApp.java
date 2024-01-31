package phonebookApp;

import java.util.Scanner;

public class MainApp {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        System.out.println("""
                1-> Add Contact
                2 -> Search Contact
                3 -> Exit
                """);
        int menu = Integer.parseInt(input.nextLine());
        switch (menu){
            case 1:
                addPhoneNumber();
            case 2:
                searchPhoneNumber();
            case 3:
                exits();
                break;
            default:
                System.out.println("Invalid Input! Enter between 1 to 3");
        }


    }

    private static void exits() {
        System.out.println("Thank you!");
    }

    private static void searchPhoneNumber() {
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        PhoneBook myPhoneBook = new PhoneBook();
        String name = String.valueOf(myPhoneBook.searchPhoneNumber(firstName));
        System.out.println(name);
        mainMenu();
    }

    private static void addPhoneNumber() {
        System.out.print("Enter first Name:");
        String firstName = input.nextLine();


        System.out.print("Enter last Name:");
        String lastName = input.nextLine();


        System.out.print("Enter phoneNumber:");
        String phoneNumber = input.nextLine();


        PhoneBook user = new PhoneBook();
        PhoneBook contact = new PhoneBook(firstName,lastName,phoneNumber);


        user.addPhoneNumber(firstName,lastName,phoneNumber);
        System.out.println("Saved \n");
        System.out.println(contact);
        mainMenu();


    }

}
