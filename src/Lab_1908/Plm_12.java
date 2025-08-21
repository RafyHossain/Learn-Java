package Lab_1908;

import java.util.Scanner;

public class Plm_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an odd length for the array: ");
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("Array length must be odd.");
            scan.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int first = arr[0];
        int middle = arr[n / 2];
        int last = arr[n - 1];

        int largest = Math.max(first, Math.max(middle, last));

        System.out.println("Largest among first, middle, and last: " + largest);


    }
}
