// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

package FUNDAMENTALS;

import java.util.Scanner;

public class sumofNUM {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers type '0' to stop. ");

        int negsum = 0;
        int oddsum = 0;
        int evensum = 0;

        while(true){

            int num = sc.nextInt();

            if(num==0){
                break;
            }

            else if (num < 0){

                negsum = negsum + num;

            }
            else if (num > 0){
                if(num%2==0){

                    evensum = evensum + num;
                }
                else{

                    oddsum = oddsum + num;
                }
            }
            else{
                System.out.println("enter a valid number ! ");
            }

        }

       
        System.out.println("the sum of negative numbers is : "+negsum+" , the sum of positive even numbers is : "+evensum+" , the sum of positive odd numbers is : "+oddsum);

        sc.close();
    }
    
}
