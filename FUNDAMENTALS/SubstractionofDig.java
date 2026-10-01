// substraction of sum and product of digits of an integer //

package FUNDAMENTALS;

import java.util.Scanner;

class SubstractionofDig{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer to calculate : ");
        int number = sc.nextInt();

        int sum = 0;

        int product = 1;

        while(number>0){

            int temp = number%10;

            sum = sum + temp;
            product = product * temp;

            number = number /10;

        }

        int sub = product - sum ;

        System.out.println("the substraction of sum and product of the integer is : "+sub);

        sc.close();

    }

}