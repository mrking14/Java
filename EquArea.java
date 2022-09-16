//  15. Write a Java program to calculate area of an equilateral triangle.
import java.util.Scanner;

public class EquArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Side of Equilateral Triengle : ");
        int side = scan.nextInt();

        // √3 = 1.73205081     <=   Root 3's Value 

        float area = ( 1.73205081f *side*side / 2) ;

        System.out.println("Area of Equilateral Triengle Is :  "+ area );


        // A = √3a2/4
        
        scan.close();
    }
    
}
