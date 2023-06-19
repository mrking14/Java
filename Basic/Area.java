import java.util.Scanner;

// 14. Write a Java program to enter base and height of a triangle and find its area.
public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base of Triangle: ");
        int base = scan.nextInt();

        System.out.println("Enter the height of triengle : ");
        int height = scan.nextInt();

        float  area =  (float)1/2*base * height;

        System.out.println("The Area of Triengle Is : " +area );
        scan.close();
        
    }

}
