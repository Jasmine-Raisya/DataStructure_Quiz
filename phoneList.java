/* Contact book -- via linked list -- Raisya Jasmine Zahira -- 2702364761

 */

import java.util.LinkedList;
import java.util.Scanner;

public class phoneList {
    public static void main(String[] listing) {

        LinkedList<String> name = new LinkedList<String>();
        LinkedList<String> number = new LinkedList<String>();
        LinkedList<String> email = new LinkedList<String>();

        /* while loop */

        while (true){

            System.out.println(" ");
            System.out.println("Contact Book Processing Program: ");
            System.out.println(" A - Add \n E-Email Search \n P-Print \n S-Search \n Q-Quit");
            System.out.println(" ");
            System.out.println("enter a choice: ");

            /* Variables */

            Scanner Scanning = new Scanner(System.in); //Scanner object
            String user_input = Scanning.nextLine(); //input from user

            /* Switch Case */
            switch(user_input) {
                case "A": // add [input: name and number  output:]

                    System.out.println("Enter Name : ");
                    String input_name = Scanning.next();

                    System.out.println("Enter Phone Number : ");
                    String input_number = Scanning.next();

                    System.out.println("Enter Email : ");
                    String input_email = Scanning.next();

                    name.add(input_name);
                    number.add(input_number);
                    email.add(input_email);

                    System.out.println(" ");
                    System.out.println("Name : " + name);
                    System.out.println("Number : " + number);
                    System.out.println("Email : " + email);
                    System.out.println(" ");

                    break;

                case "D": // delete

                    System.out.println(" ");
                    System.out.println("Name : " + name);
                    System.out.println(" ");
                    System.out.println("Enter the name that you want to delete from the phone book : ");
                    System.out.println(" ");

                    String Delete = Scanning.next();
                    if (name.contains(Delete)) { // Check if the input is a name in the list
                        int index = name.indexOf(Delete); // Get the index of the name
                        name.remove(index); // remove / delete the name from phonebook
                        number.remove(index); // deletes number
                        email.remove(index); // deletes email
                    } else {
                        System.out.println("Invalid input. Please enter a valid name or index.");
                    }
                    break;

                case "E": // email search
                    System.out.println(" ");
                    System.out.println("Here are the available names to search: ");
                    System.out.println(name);

                    System.out.println(" ");
                    System.out.println("Who's email would you like to search?");

                    String search_name = Scanning.next();
                    if (name.contains(search_name)) { // Check if the input is a name in the list
                        int index = name.indexOf(search_name); // Get the index of the name
                        System.out.println("Email : " + email.get(index)); // Print the email corresponding to the index
                    } else {
                        System.out.println("Invalid input. Please enter a valid name or index.");
                    }
                    break;


                case "P": //print list:

                    System.out.println(" ");
                    System.out.println("Name : " + name);
                    System.out.println("Number : " + number);
                    System.out.println("Email : " + email);
                    System.out.println(" ");


                    break;

                case "S": // search

                    System.out.println(" ");
                    System.out.println("Here are the available names to search: ");
                    System.out.println(name);

                    System.out.println(" ");
                    System.out.println("Who's information would you like to search?");

                    String search = Scanning.next();
                    if (name.contains(search)) { // Check if the input is a name in the list
                        int index = name.indexOf(search); // Get the index of the name

                        System.out.println(" ");
                        System.out.println("Name : " + name.get(index));
                        System.out.println("Number : " + number.get(index));
                        System.out.println("Email : " + email.get(index)); // Print the rest of the info corresponding to the index

                    } else {
                        System.out.println("Invalid input. Please enter a valid name or index.");
                    }
                    break;

                case "Q": // quit
                    System.out.println("Thank you for using this program, goodbyeeee ");
                    return;

            }

        }
    }
}
