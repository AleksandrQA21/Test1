package Tasks;
/*
   Напишите программу, которая заменяет в строке все буквы "а", на "@".
   Буквы о на цифру 0. Выводить новую строку на экран. Добавить обработку строки.
   Максимальная длина строки 30 символов. Строка может состоять из нескольких слов и любых символов.
  */
import java.util.Scanner;

public class Task5 {
    public void replaceCharacters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = sc.nextLine();

        validationTextLength(text);
    }

    public static void replaceText(String str){
        String s1 = str.replace('a','@');
        String s2 = s1.replace('o','0');

        System.out.println(s2);
    }

    public static void validationTextLength(String string){
        if(string.length() > 30){
            System.out.println("Text couldn't be longer than 30 characters");
        }else{
            replaceText(string);
        }
    }
}
