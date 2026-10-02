// to calculate average of desired numbers //

package FUNDAMENTALS;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the numbers of integers to find the Average : ");
        int num = sc.nextInt();

        double sum = 0;


        for(int i = 1 ; i<=num ; i++){

            System.out.print("enter the number : ");
            double dig = sc.nextDouble();

            sum = sum + dig;

        }

        System.out.print("the average is : ");

        System.out.println(sum/num);

        sc.close();
     

    }
    
}
