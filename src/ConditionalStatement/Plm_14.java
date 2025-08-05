package ConditionalStatement;

import java.util.Scanner;

public class Plm_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(n + " X " + i + " = " + (n*i));
        }


    }
}
