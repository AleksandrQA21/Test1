package Tasks;

import java.util.Arrays;
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
        System.out.println("Input number: ");
        int num = sc.nextInt();

        printResult(num,calculateSumOfNumber(convertNumberToArray(num)));

    }

    public static int [] convertNumberToArray(int number){

        String s = Integer.toString(number);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        return arr;
    }

    public static int calculateSumOfNumber(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += Math.pow(number[i], number.length);
        }return sum;
    }

    public static void printResult(int a, int b){
        if (a == b){
            System.out.println("It's Armstrong number");
        }else{
            System.out.println("It's not Armstrong number");
        }
    }
}
