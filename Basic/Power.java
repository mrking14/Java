// 11. Write a Java program to find power of any number x ^ y.

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter the Number : ");
        int num= scan.nextInt();

        System.out.println("Enter the Power : ");
        int power = scan.nextInt();

        int num1 = num;

        // int i=1;                              Using While Loop 
        // while(i<power){
        //     num = num*num1;
        //     i++;
        // }

        for (int j = 1; j < power; j++) {         //  Using For Loop
            num = num*num1;
            
        }

        double number = Math.pow(num1, power);


        System.out.println("The power of Number is : " +num);

        System.out.println("The power Using (Math.pow) is " + number);


        scan.close();
    }
    
}
