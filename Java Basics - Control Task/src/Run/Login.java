package Run;

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

    public void inputLogin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please input your login:  ");
        String login = sc.nextLine();

        validationLogin(login);
    }

    public void validationLogin(String str){
        if(str.equals(login)){
            System.out.println("Login is correct");
        } else {
            System.out.println("Login is incorrect");
            System.exit(1);
        }
        inputPassword();
    }

    public void inputPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your password:  ");
        String password = sc.nextLine();
        validationPassword(password);

    }
    public void validationPassword(String pass) {
        if (pass.equals(password)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
            System.exit(1);
        }
    }
}
