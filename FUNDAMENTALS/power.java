// finding power using loop //

package FUNDAMENTALS;

import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the base : ");
        int base = sc.nextInt();

        System.out.print("enter the power : ");
        int power = sc.nextInt();

        int pro = 1;

        for(int i =1 ; i<=power ; i++ ){

            pro = pro*base;
        }

        System.out.println(base + " to the power of " +power+ " is : " +pro);

        sc.close();
    }
    
}
