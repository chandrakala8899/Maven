package Bank;

public class PassBookTest {
    public static void main(String[] args) {
        UserInputs userInputs = new UserInputs();
        Address userAddress = new Address();
        userAddress.houseNo="2-100";
        userAddress.village="Amaravai";
        userAddress.district="Kurnool";
        userAddress.pincode="509128";

        userInputs.name= "Chandhu";
        userInputs.aadharNumber="7276";
        userInputs.dob="31-01-2002";
        userInputs.mobileNumber="9908";
        userInputs.address = userAddress;
AccountService accountService= new AccountService();
PassBook passBook = accountService.Process(userInputs);

        System.out.println(passBook.accountNumber);


    }
}
