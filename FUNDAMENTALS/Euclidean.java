// EUCLIDEAN Algorithm for HCF and LCM //

package FUNDAMENTALS;

import java.util.Scanner;

public class Euclidean {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = sc.nextInt();

        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while(b!=0){

            int temp = b;
            b=a%b;
            a=temp;
        }

        int hcf = a;

        System.out.println("your HCF is : "+hcf);

        int lcm = (num1*num2)/hcf;

        System.out.println("your LCM is :"+lcm);

        sc.close();
        
    }
}
