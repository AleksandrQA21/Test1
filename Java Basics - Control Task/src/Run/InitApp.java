package Run;

import Tasks.*;

import java.util.Scanner;

public class InitApp {
    public static void main(String[] args) {

        Login login = new Login();
        login.setLogin("Aleksandr");
        login.setPassword("1q2w3e4r");
        login.inputLogin();

        System.out.println("Please select task number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Task1 object = new Task1();
        Task2 object2 = new Task2();
        Task3 object3 = new Task3();
        Task4 object4 = new Task4();
        Task5 object5 = new Task5();

        switch (num) {
            case 1 -> object.inputData();
            case 2 -> object2.inputNumber();
            case 3 -> object3.inputText();
            case 4 -> object4.fibonacciNumbers();
            case 5 -> object5.replaceCharacters();
            default -> System.out.println("Task: Incorrect task number");
        }
    }
}

