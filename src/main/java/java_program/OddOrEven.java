package java_program;

import java.util.Scanner;

public class OddOrEven {

    public void check(int a){
        if(a%2==0) {
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        OddOrEven oddOrEven= new OddOrEven();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int a= sc.nextInt();
        oddOrEven.check(a);


    }
}
