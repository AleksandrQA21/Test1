package Tasks;
/*
   Напишите программу, которая заменяет в строке все буквы "а", на "@".
   Буквы о на цифру 0. Выводить новую строку на экран. Добавить обработку строки.
   Максимальная длина строки 30 символов. Строка может состоять из нескольких слов и любых символов.
  */
import Exceptions.NotValidArgumentException;

import java.util.Scanner;

public class Task5 {
    public void replaceCharacters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = sc.nextLine();

        validationTextLength(text);
    }

    public static void replaceText(String str) {
        String s1 = str.replace('a', '@');
        String s2 = s1.replace('o', '0');

        System.out.println(s2);
    }

    //Обернул в try-catch блок с использованием своего кастомного эксепшена NotValidArgumentException
    public static void validationTextLength(String string) {
        try {
            if (string.length() > 30) {
                throw new NotValidArgumentException(string.length());
            }
        } catch (NotValidArgumentException exception) {
            System.out.println("Text length can't be more than 30 characters");
            exception.printStackTrace();
            System.exit(0);
        }
        replaceText(string);
    }
}

