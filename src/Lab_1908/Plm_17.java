package Lab_1908;

import java.util.Scanner;

public class Plm_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scan.nextInt();
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        String sumStr = Integer.toString(sum);
        System.out.print("Digits in English: ");
        for (int i = 0; i < sumStr.length(); i++) {
            char c = sumStr.charAt(i);
            switch (c) {
                case '0': System.out.print("Zero ");
                break;
                case '1': System.out.print("One ");
                break;
                case '2': System.out.print("Two ");
                break;
                case '3': System.out.print("Three ");
                break;
                case '4': System.out.print("Four ");
                break;
                case '5': System.out.print("Five ");
                break;
                case '6': System.out.print("Six ");
                break;
                case '7': System.out.print("Seven ");
                break;
                case '8': System.out.print("Eight ");
                break;
                case '9': System.out.print("Nine ");
                break;
            }
        }


    }
}
