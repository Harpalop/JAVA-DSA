// to check prime number //

package FUNDAMENTALS;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check prime or not : ");
        int num = sc.nextInt();

        boolean istrue = true;

        if(num<=1){

            istrue = false;

        }
        else{

            for(int i=2;i<=num/2;i++){

                if(num%i==0){

                    istrue = false;
                }

            }

        }

        if(istrue){

            System.out.println("your given number is a prime number !");
        }
        else{

            System.out.println("its not a prime number.");
        }

        
        sc.close();
    }
    
}
