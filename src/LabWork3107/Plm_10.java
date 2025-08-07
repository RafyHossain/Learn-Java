package LabWork3107;

import java.util.Scanner;

public class Plm_10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size= input.nextInt();

        System.out.print("Enter volue of array: ");
        int[] numbers=new int[size];
        for(int i=0;i<size;i++)
        {
            numbers[i]=input.nextInt();
        }

        int max=numbers[0];
        int min=numbers[0];

        for(int i=0;i<size;i++)
        {
            if(numbers[i]>max)
                max=numbers[i];

            if(numbers[i]<min)
                min=numbers[i];
        }


        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);

    }

}
