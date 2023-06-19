// 18. Write a java program to enter P, T, R and calculate Compound Interest.

import java.util.Scanner;


public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Principle Amount : ");
        int principle = scan.nextInt();

        System.out.print("Enter the Intrest rate in percent Per Year : ");
        byte rate = scan.nextByte();

        System.out.print("Enter the Time in year : ");
        byte time = scan.nextByte();

        int intrest = principle*time*rate/100;

        System.out.println("Your Interest for "+time+" Years Is : " + intrest);

        System.out.println("your Amount with Intrest is " + (principle+intrest) );
        scan.close();
    }
}
