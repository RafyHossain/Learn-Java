package Lab_1908;

import java.util.Scanner;

public class Plm_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter 3 integers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
        int larger = (arr[0] > arr[2]) ? arr[0] : arr[2];
        System.out.println("Larger value between first and last: " + larger);


    }
}
