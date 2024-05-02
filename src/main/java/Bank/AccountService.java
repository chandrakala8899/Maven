package Bank;

import java.util.UUID;

public class AccountService {

public  PassBook Process(UserInputs userInputs){
  PassBook passBook = new PassBook();
  Address address= new Address();
  address.houseNo="2-164";
  address.village="Manopad";
  address.district="Gadwal";
  address.pincode="209125";

  passBook.accountHolderName= userInputs.name;
  passBook.userAddress= userInputs.address;
  passBook.accountNumber= UUID.randomUUID().toString();
 // passBook.accountNumber= "224466";
  passBook.bankAddress=address;
  passBook.ifcCode="SBIN0006111";
  return passBook;
}
}
