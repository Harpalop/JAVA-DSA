// to check prime numbers between a given range //

package FUNDAMENTALS;

import java.util.Scanner;

public class primeRange {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int first = sc.nextInt();

        System.out.print("Enter the second number : ");
        int second = sc.nextInt();

        System.out.println("your prime numbers between the given range is : ");

        for(int i = first; i<=second ;i++){

            boolean istrue = true;

            int temp = i;

            if(temp<=1){
                
                istrue = false;

            }

            else{

                for(int a = 2; a<=temp/2 ;a++){

                    if(temp%a==0){
                        istrue=false;
                    }

                }
            }

            if(istrue){
                System.out.println(temp);
            }
        }

        sc.close();
    }
    
}
