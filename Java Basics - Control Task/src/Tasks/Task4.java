package Tasks;
// Рассчитать первые 50 чисел Фибоначчи. Вывести их на экран.
public class Task4 {
    public void fibonacciNumbers() {
        int maxNumber = 50;
        long previousNumber = 0;
        long nextNumber = 1;

        System.out.print("Calculating first 50 Fibonacci numbers: ");
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber+" ");
            long sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
