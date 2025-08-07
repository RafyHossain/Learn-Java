package LabWork3107;

import java.util.Scanner;

public class Plm_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size=input.nextInt();

        double[] numbers = new double[size];
        System.out.print("Enter "+ size +" number: ");
        double sum=0;
        double avg;

        for(int i=0;i<size;i++){
            numbers[i]=input.nextDouble();
            sum+=numbers[i];
        }
        avg=sum/size;
        System.out.println("Average value is : "+avg);
    }

}
