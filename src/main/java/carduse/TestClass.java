package carduse;

public class TestClass {
    public static void main(String[] args) {
        Login login = new Login();
      LoginService loginProcess = new LoginService();
      loginProcess.userName= "Chandu";
      loginProcess.passWord = "1234";
       boolean loginStatus = loginProcess.login(login.userName, login.passWord);

        PaymentMethod paymentMethod = new PaymentMethod();
        Products products= new Products();
        products.noOfItems = 6;
       paymentMethod.noOfItems = 6;
       paymentMethod.payment(products);

        System.out.println(   " Account Balance :"+paymentMethod.accountBalance);
        System.out.println(" Remaining Balance :" +paymentMethod.remainingBalance);
        System.out.println(  " Products Price :"+paymentMethod.totalPrice);
        System.out.println( "After Adding Balance Final Balance :" +paymentMethod.addBalance);
        if (loginStatus){
            int balance1 = paymentMethod.Product(2);
            System.out.println(balance1);
            int balance2 =paymentMethod.Product(2); ;
            System.out.println(balance2);
            int balance3 =paymentMethod.Product(2);;
            System.out.println(balance3);

        }
    }
    }
