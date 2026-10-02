// to reverse a string //

package FUNDAMENTALS;

import java.util.Scanner;

public class revString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your string to reverse : ");
        String org = sc.nextLine();

        String rev = "";

        for(int i = org.length()- 1; i>=0 ; i--){

            rev = rev + org.charAt(i);

        }

        System.out.println("your reversed string is : "+ rev);

        sc.close();
    }
    
}
