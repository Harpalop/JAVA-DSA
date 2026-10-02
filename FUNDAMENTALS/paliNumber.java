// to check for palindrome numbers //

package FUNDAMENTALS;

import java.util.Scanner;

public class paliNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number to check palindrome or not : ");
        int number = sc.nextInt();

        int rev = 0;

        for(int i = number ; i>0 ; i=i/10 ){

            int temp = i %10;
            rev = (rev*10)+temp; 

        }

        if(rev==number){

            System.out.println("your number is a palindrome !");
        }
        else{
            System.out.println("its not a palindrome.");
        }

        sc.close();
    }
    
}
