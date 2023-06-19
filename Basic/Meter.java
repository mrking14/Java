// 7. Write a Java program to enter length in centimeter and convert it into meter and kilometer.
import java.util.Scanner;
public class Meter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Length in Centimeter : ");
        int centimeter= scan.nextInt();

        int meter = centimeter/100;

        float kilometer = (float) meter/1000;

        System.out.println("Your Length in Meter is : " + meter);
        System.out.println("Your Length on Kilometer is : " + kilometer);

        scan.close();
        
    }
    
}
