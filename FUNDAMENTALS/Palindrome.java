// checking whether a string is palindrome or not //

package FUNDAMENTALS;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check the palindrome : ");
        String org = sc.nextLine();

        org = org.toLowerCase();

        String rev = "";

        for(int i = org.length()-1 ; i>=0 ; i--){

            rev = rev + org.charAt(i);

        }

        if(org.equals(rev)){

            System.out.println("the String is a Palindrome !");

        }
        else{
            System.out.println("the String is not a Palindrome.");
        }

        sc.close();
    }
    
}
