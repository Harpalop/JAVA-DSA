// to find a perfect number //

package FUNDAMENTALS;

import java.util.Scanner;

public class perfectNum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number to check for perfect number : ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<num ; i++){

            if(num%i==0){
                sum = sum+i;
            }
        }

        if(sum==num){
                System.out.println("it a perfect number !");
        }

        else{
            System.out.println("its not a perfect number.");
        }

        sc.close();
    }
    
}
