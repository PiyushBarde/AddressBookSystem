public class AddressBookSystem {
     String firstName, lastName,address,city,state,email;
      int zipCode;
      long phoneNumber;
      public static int counter = 0;
            public AddressBookSystem(String firstName,String lastName,String address,String city,
                                     String state,String email, int zipCode,long phoneNumber)
            {
                this.firstName= firstName;
                this.lastName= lastName;
                this.address=address;
                this.city=city;
                this.state=state;
                this.email=email;
                this.zipCode=zipCode;
                this.phoneNumber=phoneNumber;

            }
   }