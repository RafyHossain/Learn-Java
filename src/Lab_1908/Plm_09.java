package Lab_1908;

import java.util.Scanner;

public class Plm_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter 3 integers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
        int[] rotated = new int[3];
        rotated[0] = arr[1];
        rotated[1] = arr[2];
        rotated[2] = arr[0];
        System.out.println("Rotated array:");
        for (int val : rotated) {
            System.out.print(val + " ");
        }


    }
}
