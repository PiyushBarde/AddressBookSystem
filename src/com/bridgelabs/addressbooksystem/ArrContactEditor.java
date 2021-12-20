import java.util.Scanner;
public class ArrContactEditor {
    static Scanner sc = new Scanner(System.in);
    static void contactEditor(){
        System.out.println("Enter the first Name of the person " +
                            "whos contact you want to edit : ");
        String nameToEdit = sc.nextLine();

            for(int i =0; i <= ArrAddressBookSystem.addressBookSystem.length;i++)
                {

                if(ArrAddressBookSystem.addressBookSystem[i].firstName.equals(nameToEdit))
                {
                    System.out.println("Enter first name = ");
                    String changedFirstName = sc.next();
                    System.out.println("Enter last name = ");
                    String changedLastName = sc.next();
                    System.out.println("Enter Address = ");
                    String changedAddress = sc.next();
                    System.out.println("Enter City = ");
                    String changedCity = sc.next();
                    System.out.println("Enter  State = ");
                    String changedState = sc.next();
                    System.out.println("Enter  Email= ");
                    String changedEmail = sc.next();
                    //-------------int & long---------------//
                    System.out.println("Enter zip code = ");
                    int changedZip = sc.nextInt();
                    System.out.println("Enter phone Number = ");
                    long changedPhoneNumber = sc.nextLong();
                    ArrAddressBookSystem.addressBookSystem[i] = new AddressBookSystem(changedFirstName,changedLastName,changedAddress,changedCity,changedState,changedEmail,changedZip,changedPhoneNumber);

                }

            }
        }
}
