package FUNDAMENTALS;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the term to print fibonacci series : ");
        int term = sc.nextInt();

        int first = 0;
        int second = 1;

        int sum = 0;

        System.out.println("");
 
        for(int i=0;i<=term;i++){

            System.out.print(first+" ");

            sum=first+second;
            first = second;
            second = sum;


        }

        sc.close();
        

    }
    
}
