package carduse;

public class LoginService extends Login {
    public boolean login(String username,String password){
        if (userName.equals(username) & passWord.equals(password)){
            System.out.println("Login Succesfull");

        }else {
            System.out.println("Login Failed");
        }
        return true;
    }
}
