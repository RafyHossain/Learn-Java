package LabWork3107;

import java.util.Scanner;

public class Plm_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        int sum=0;
        System.out.print("Enter the "+ size + " Numbers: ");

        for(int i=0;i<size;i++){
            numbers[i]=input.nextInt();
            sum=sum+numbers[i];



        }
        System.out.println("Sum is: "+sum);
    }

}
