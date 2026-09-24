// Simple calculator based on user input operations //

package FUNDAMENTALS;

import java.util.Scanner;

public class SimpleCal {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number : ");
        double firstnum = sc.nextInt();

        System.out.println("enter the second number : ");
        double secondnum = sc.nextInt();
        
        System.out.println("chooose an operator from '%,/,*,+,-'");
        char chosen = sc.next().charAt(0);

        double result = 0;
        boolean valid = true;

        if(chosen=='/'){

            if(secondnum!=0){

                result = firstnum/secondnum;
                
            }
            else{
                
                System.out.println("cannot divide by 0");
                valid = false;
            }
        }

        else if(chosen=='%'){

            result = firstnum%secondnum;
            
        }

        else if(chosen=='*'){

            result=firstnum*secondnum;

        }

        else if(chosen=='-'){

            result=firstnum-secondnum;

        }

        else if(chosen=='+'){

            result=firstnum+secondnum;

        }

        else{
            System.out.println("choose an valid operator !");
            valid=false;
        }

        if(valid){

            System.out.println("your final result is : "+result);
        }

        sc.close();
    }
    
}
