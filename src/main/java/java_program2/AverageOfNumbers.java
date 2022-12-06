package java_program2;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");

        int num1= sc.nextInt();
        int num2= sc.nextInt();
        float average=(num1+num2)/2;
        System.out.println("The average of numbers are:"+average);
    }
}
