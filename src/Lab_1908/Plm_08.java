package Lab_1908;

import java.util.Scanner;

public class Plm_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.println("Enter 2 integers for the array:");
        for (int i = 0; i < 2; i++) arr[i] = scan.nextInt();
        boolean result = (arr[0] == 4 || arr[0] == 7 || arr[1] == 4 || arr[1] == 7);

        System.out.println("Array contains 4 or 7? " + result);


    }
}
