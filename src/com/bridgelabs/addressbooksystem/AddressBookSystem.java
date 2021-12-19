package com.bridgelabs.addressbooksystem;
import java.util.Scanner;
public class AddressBookSystem {
    static class AddressBook {
          String firstName, lastName, address, city, state;
          int zipCode;
          long phoneNumber;

             AddressBook() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first Name = ");
            firstName = sc.nextLine();
            System.out.println("Enter Last Name = ");
            lastName = sc.nextLine();
            System.out.println("Enter address = ");
            address = sc.nextLine();
            System.out.println("vEnter city = ");
            city = sc.nextLine();
            System.out.println("Enter state = ");
            state = sc.nextLine();
            System.out.println("Enter zipCode = ");
            zipCode = sc.nextInt();
            System.out.println("Enter phoneNumber = ");
            phoneNumber = sc.nextLong();
        }
    }
    
    public static void main(String[] args) {
    	AddressBook person1 = new AddressBook();
    }
}
