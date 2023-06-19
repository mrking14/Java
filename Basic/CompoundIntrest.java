// 18. Write a java program to enter P, T, R and calculate Compound Interest.


import java.util.Scanner;

public class CompoundIntrest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Principle Amount : ");
        double  principle = scan.nextDouble();

        System.out.println("Enter Intrest Rate  : ");
        double  rate = scan.nextDouble();

        System.out.println("Enter Duration in Year : ");
        double  time = scan.nextDouble();


        double compoundI=  principle* Math.pow((1+rate/100), time) ;

        System.out.println("Amount of Compound Intrest is : " + compoundI);
        scan.close();
    }

}
