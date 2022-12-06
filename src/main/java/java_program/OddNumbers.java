package java_program;

import java.util.Scanner;

public class OddNumbers {
    public void odd(int num1, int limit) {

            for (int i = num1; i <= limit; i++) {
                if (i%2!=0) {
                System.out.println(i);
            }

        }
    }
        public static void main (String[]args){
            OddNumbers oddNum = new OddNumbers();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Number");
            int num1 = sc.nextInt();
            System.out.println("Enter your limit ");
            int limit = sc.nextInt();
            oddNum.odd(num1,limit);


        }

    }

