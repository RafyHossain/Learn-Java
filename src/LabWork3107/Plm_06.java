package LabWork3107;

import java.util.Scanner;

public class Plm_06 {
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
        System.out.print("Enter the value for searceh index: ");
        int src=input.nextInt();
        int index=-1;

        for(int i=0;i<size;i++)
        {
            if(numbers[i]==src)
            {
                index=i;
                break;


            }


        }

        if(index>=0)
            System.out.println("Index is: "+index);
        else
            System.out.println(" Your searching number not found");


    }

}
