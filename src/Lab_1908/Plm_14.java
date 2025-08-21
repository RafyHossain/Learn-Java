package Lab_1908;

import java.util.Scanner;

public class Plm_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string (length > 3): ");
        String str = scan.nextLine();

        if (str.length() <= 3) {
            System.out.println("String length must be greater than 3.");
            scan.close();
            return;
        }

        String lastThree = str.substring(str.length() - 3);
        String result = lastThree + str + lastThree;

        System.out.println("New string: " + result);


    }
}
