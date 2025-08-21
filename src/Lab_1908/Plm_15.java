package Lab_1908;

import java.util.Scanner;

public class Plm_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        System.out.print("Enter the word to check: ");
        String word = scan.nextLine();

        boolean startsWith = str.startsWith(word);
        System.out.println("String starts with \"" + word + "\": " + startsWith);


    }
}
