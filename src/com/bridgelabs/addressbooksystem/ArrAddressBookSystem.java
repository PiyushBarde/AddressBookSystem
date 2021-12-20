import java.util.Scanner;

public class ArrAddressBookSystem {
    static boolean ans = true;
    static int counter = 0;
    static AddressBookSystem[] addressBookSystem = new AddressBookSystem[10];

    static void addContact()
    {

        Scanner sc = new Scanner(System.in);
        while (ans) {
            /*----------------Strings----------------------*/
            System.out.println("Enter first name = ");
            String subFirstName = sc.next();
            System.out.println("Enter Last name = ");
            String subLastName = sc.next();
            System.out.println("Enter Address = ");
            String subAddress = sc.next();
            System.out.println("Enter City = ");
            String subCity = sc.next();
            System.out.println("Enter  State = ");
            String subState = sc.next();
            System.out.println("Enter  Email= ");
            String subEmail = sc.next();
            //-------------int & long---------------//
            System.out.println("Enter zip code = ");
            int subZip = sc.nextInt();
            System.out.println("Enter phone Number = ");
            long subPhoneNumber = sc.nextLong();
            addressBookSystem[counter] = new AddressBookSystem(subFirstName,subLastName,subAddress,subCity,subState,subEmail,subZip,subPhoneNumber);

            //-------------------------------//
            System.out.println("to add another contact = press 1 ");
            System.out.println("to edit existing contact = press 2");
            System.out.println("to exit Addressbook = press 3");
            int continueAns = sc.nextInt();
            if (continueAns == 1) {
                counter++;
                ans = true;
            }
            else if(continueAns == 2){
                ArrContactEditor.contactEditor();
            }
            else{
                ans = false;
            }
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 : to add the contact");
        System.out.println("press 2 : to edit the contact");
        int ansCondition = sc.nextInt();
        if(ansCondition==2 && counter==0)
        {
            System.err.println("Not a Contact Saved Yet");
        }
        switch (ansCondition){
            case 1:
                addContact();
                break;
            case 2:
                ArrContactEditor.contactEditor();
                break;
            default:
                break;
        }
    }
}



