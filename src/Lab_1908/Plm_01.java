package Lab_1908;

import java.util.Scanner;

public class Plm_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        String newStr1= str1.substring(1);  // string tar 1st index remove kore index 1 theke baki part rakhbe
        String newStr2= str2.substring(1);
        String finalStr=newStr1.concat(newStr2); //newStr1 and newStr2 eksthe jog korbe
        System.out.println(finalStr);
    }
}
