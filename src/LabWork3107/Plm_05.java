package LabWork3107;

import java.util.Scanner;

public class Plm_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] numbers=new int[size];

        System.out.print("Enter "+ size + " number: ");

        for(int i=0;i<size;i++)
        {
            numbers[i]=input.nextInt();

        }
        System.out.print("Enter the value for searceh: ");
        int src=input.nextInt();
        int found=0;

        for(int i=0;i<size;i++)
        {
            if(numbers[i]==src)
            {
                found++;
                break;


            }
            else
                found=0;

        }

        if(found==0)
            System.out.println("Not Found");
        else
            System.out.println(" Found");


    }
}
