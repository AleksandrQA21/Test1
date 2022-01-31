package Tasks;

import java.util.Scanner;
/*
   Напишите программу, которая определяет число четное или нечетное. Проверять только целые числа.
   Добавить обработку ошибок с описанием.
  */
public class Task1 {

    private int x;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();
        evenNumber(number);

    }


//    public static void validationInputNumber(int data){}

    public static void evenNumber(int num){

        if(num % 2 == 0){
            System.out.println(num + " is even");
        }else {
            System.out.println(num + " is odd");
        }
    }
}
