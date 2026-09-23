package FUNDAMENTALS;

import java.util.Scanner;
public class Table {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print Table.");
        int num = sc.nextInt();

        for(int i=1;i<=10;i++){

            int sum = num*i;
            System.out.println(num+"x"+i+"="+sum); 
        }

        sc.close();

    }
    
}
