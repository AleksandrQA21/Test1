package Tasks;

import java.util.Scanner;

// Рассчитать первые 50 чисел Фибоначчи. Вывести их на экран.
public class Task4 {
    public void fibonacciNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = scanner.nextInt();

        calculateNumber(number);
    }

    public static void calculateNumber(int num) {
        int maxNumber = num;
        long previousNumber = 0;
        long nextNumber = 1;

        System.out.print("Calculating first 50 Fibonacci numbers: ");
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            long sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
