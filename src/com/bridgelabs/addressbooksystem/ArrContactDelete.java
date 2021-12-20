import java.util.Scanner;
public class ArrContactDelete {
    static void arrContactDelete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Name of the person" +
                "you want to delete contact of");
        String deleteContact = sc.next();
        for(int i =0; i <= ArrAddressBookSystem.addressBookSystem.length;i++){
            if(ArrAddressBookSystem.addressBookSystem[i].firstName.equals(deleteContact))
            {
                ArrAddressBookSystem.addressBookSystem[i]=null;
            }
        }
    }
}
