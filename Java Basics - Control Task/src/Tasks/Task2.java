package Tasks;

import java.util.Scanner;
/*
   Напишите программу, которая определяет является ли введенное число - числом Армстронга.
   Число Армстронга - это число, значение которого равно сумме цифр. из которых оно состоит,
   возведенных в степень, равную количеству цифр в этом числе. Например число 371:
   371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 341 +1 = 371
  */
public class Task2 {
    public void inputNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();

        calculateArmstrongNumber(number);

    }

    public static void calculateArmstrongNumber(int num){

    }
}
