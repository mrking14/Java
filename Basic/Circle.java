// 6. Write a Java program to enter radius of a circle and find its diameter, circumference and area.
import java.util.Scanner;
class Circle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Value for radius Of Circle : ");
        int radius = scan.nextInt();

        float pi = 3.14f;

        int diameter = 2*radius;
        float circumference = 2*pi*radius;
        float area = pi*radius*radius;

        System.out.println("The Diameter of Ciecle is : " + diameter);
        System.out.println("The Circumference of Circle is : " + circumference);
        System.out.println("The Area of Cirle is : " + area);

        scan.close();

        
    }
}

