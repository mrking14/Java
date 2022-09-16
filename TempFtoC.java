// 9. Write a Java program to enter temperature in Fahrenheit and convert to Celsius

import java.util.Scanner;

public class TempFtoC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Temprature in Fahrenheit :  ");
        int fahrenheit = scan.nextInt();

        float celsius =    (float) (fahrenheit-32 )* 5/9;

        System.out.println("The Temperature in Celsius is : " + celsius);

        scan.close();

    }
}
