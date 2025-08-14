package Lab_1408;

import java.util.Scanner;

public class Plm_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=input.nextLine();
        str=str.toLowerCase();

        int vowels=0;
        int consonants=0;

        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Total vowels: " + vowels);
        System.out.println("Total consonants: " +consonants);


    }
}
