// keep inputting the number until the user types 'x' and return sum of all number at the end

package FUNDAMENTALS;

import java.util.Scanner;

class Xnumbers{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number type 'x' to stop" );

        int total = 0;

        while(true){

            String number = sc.next();

            if(number.equalsIgnoreCase("x")){

                break;

            }

            int finalnum = Integer.parseInt(number);

            total = total + finalnum;
        }

        System.out.println("your final sum is : "+total);

        sc.close();

    }
}

