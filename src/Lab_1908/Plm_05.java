package Lab_1908;

import java.util.Scanner;

public class Plm_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements (>=2): ");
        int n = scan.nextInt();
        if (n < 2) {
            System.out.println("Array length must be at least 2.");
            scan.close();
            return;
        }
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)  arr[i] = scan.nextInt();

        boolean result = (arr[0] == arr[n - 1]);
        System.out.println("Result: " + result);


    }
}
