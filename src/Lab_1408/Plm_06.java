package Lab_1408;

import java.util.HashSet;
import java.util.Scanner;

public class Plm_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scan.nextLine();
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(!seen.contains(ch)){
                result.append(ch);
                seen.add(ch);
            }
        }
        String ans = result.toString();
        System.out.println("After removing duplicate character then the new string is: " + ans);


    }
}
