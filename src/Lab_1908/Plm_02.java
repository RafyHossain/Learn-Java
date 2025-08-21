package Lab_1908;

import javax.swing.*;
import java.util.Scanner;

public class Plm_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        if(str.length()>=3) {
            result = str.substring(0, 3);
        }
         else {
            result = str;
            while (result.length() < 3) {
                result += "#";
            }
        }
         System.out.println(result);




    }
}
