// finding Armstrong numbers //

package FUNDAMENTALS;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbers to check armstrong numbers between them : ");

        System.out.print("enter the first number : ");
        int first = sc.nextInt();

        System.out.print("enter the second number : ");
        int second = sc.nextInt();

        System.out.println("ther Armstrong number between "+first+" and "+second+" is : ");

        for(int i = first ; i<=second ; i++ ){

            int temp = i;
            int sum = 0;

            int digits = String.valueOf(temp).length();

            while(temp>0){

                int lastdig = temp%10;

                sum = sum + (int)Math.pow(lastdig,digits);

                temp = temp/10;
            }

            if(sum==i){
                System.out.println(i);
            }


        }

        
        sc.close();

    }
    
}

