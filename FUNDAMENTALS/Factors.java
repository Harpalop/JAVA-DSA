// finding the factors of a number //

package FUNDAMENTALS;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number to find all its factors : ");
        int number = sc.nextInt();

        System.out.println("the factors for the number "+number+" is :" );

        for(int i = 1 ; i<=number ; i++){

            if(number%i==0){

                System.out.println(i);
            }
        }

        sc.close();
    }
    
}
