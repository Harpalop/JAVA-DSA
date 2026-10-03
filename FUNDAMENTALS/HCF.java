// to find highest common factor //

package FUNDAMENTALS;

import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your numbers to find HCF :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int hcf = 1;

        for(int i = 1 ; i<=num1 && i<=num2 ; i++){

            if(num1%i==0 && num2%i==0){

                hcf = i;
            }
        }

        System.out.println("your HCF is : "+hcf);

        sc.close();
    }
    
}
