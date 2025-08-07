package LabWork3107;

import java.util.Scanner;

public class Plm_11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size= input.nextInt();

        int[] numbers= new int[size];
        System.out.print("Enter the value of array: ");
        for(int i=0;i<size;i++)
        {
            numbers[i]=input.nextInt();
        }
        System.out.print("Reverse array is: ");


        for(int i=size-1;i>=0;i--)
        {
            System.out.print(numbers[i]+" ");



        }
    }
}
