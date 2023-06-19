// 13. Write a Java program to enter two angles of a triangle and find the third angle.
import java.util.Scanner;

public class Find3rdAngle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Angle of Tringle: ");
        int angle1 = scan.nextInt();
        
        System.out.println("Enter 2st Angle of Tringle: ");
        int angle2 = scan.nextInt();

        int angle3 = 180 - (angle1+angle2);

        System.out.println("the 3rd Angle Accoding to given Angles : " + angle3);

        scan.close();



    }
}
