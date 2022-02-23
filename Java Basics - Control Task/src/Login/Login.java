package Login;

import java.io.IOException;
import java.util.Scanner;

public class Login {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void inputLogin()  {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please input your login:  ");
        String login = sc.nextLine();

        validationLogin(login);
    }
    //Добавил обработку исключения для логина с помощью try-catch
    public void validationLogin(String str)  {
        try {
            if (!str.equals(login)) {
                throw new Exception("Incorrect login");
            }
        }catch (Exception e){
            System.out.println("Incorrect login is entered!");
            e.printStackTrace();
            System.exit(0);
        }
        inputPassword();
    }

    public void inputPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your password:  ");
        String password = sc.nextLine();
        validationPassword(password);

    }

    //Добавил обработку исключения для пароля с помощью try-catch
    public void validationPassword(String pass)  {
        try {
            if (!pass.equals(password)){
                throw new Exception("Incorrect password");
            }
        }catch (Exception exception){
            System.out.println("Incorrect password is entered!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
