// Take integer inputs till the user enters 0 and print the sum of all numbers //

package FUNDAMENTALS;

import java.util.Scanner;

public class intInput {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("keep entering the numbers type 0 to stop ! ");

        int sum = 0;

        while(true){

            int number = sc.nextInt();

            if(number==0){
                break;
            }

            sum = sum + number;
        }

        System.out.println("the total sum is : "+sum);
        
        sc.close();
    }
}
