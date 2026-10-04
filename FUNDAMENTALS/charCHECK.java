// checking for vowel or consonant //

package FUNDAMENTALS;

import java.util.Scanner;

public class charCHECK {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the character to check : ");
        char c = sc.next().charAt(0);

        c = Character.toLowerCase(c);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){

            System.out.println("its a vowel ! ");
        }
        else{
            System.out.println("its a consonant");
        }

        sc.close();
    }
    
}
