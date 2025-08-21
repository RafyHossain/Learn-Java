package Lab_1908;

import java.util.Scanner;

public class Plm_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        int n = scan.nextInt();

        System.out.println("Sequence:");
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.println(n);


    }
}
