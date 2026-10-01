// Take integer inputs till the user enters 0 and print the sum of all numbers and print the largest number from all //

package FUNDAMENTALS;

import java.util.Scanner;

public class intInput {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("keep entering the numbers type 0 to stop ! ");

        int sum = 0;

        int max = Integer.MIN_VALUE;

        while(true){

            int number = sc.nextInt();

            if(number==0){
                break;
            }

            sum = sum + number;

            if(number>max){

                max = number;
            }

        }

        System.out.println("the total sum is : "+sum);

        System.out.println("the maximum number among all is : "+max);
        
        sc.close();
    }
}
