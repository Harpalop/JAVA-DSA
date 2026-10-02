// to calculate the batting average //

package FUNDAMENTALS;

import java.util.Scanner;

public class BattingAvg {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the total runs scored by a player : ");
        int runs = sc.nextInt();

        System.out.print("enter number of time got out : ");
        int out = sc.nextInt();


        if(out!=0){

            double avg = (double) runs/out;
            System.out.println("your avg is : " + avg);
        }

        else{
            System.out.println("your avg is : " + runs);
        }

        sc.close();
    }
    
}
