package Tasks;
/*
   Напишите программу для переворачивания строки, изменив расположение символов строки задом наперед
   без использования встроенных в String функций.
  */
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private String string;

    public void inputText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String str = sc.nextLine();

        System.out.println(reverseString(str));

    }

    public static String reverseString(String string){
        char [] ch = string.toCharArray();
        char [] result = new char [ch.length];
        for (int i = 0; i < ch.length; i++) {
            result [i] = ch[ch.length -i - 1];
        }return Arrays.toString(result);
    }
}
