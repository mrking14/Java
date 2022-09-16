//5. Write a Java program to enter length and breadth of a rectangle and find its area.
import java.util.Scanner;
class RecArea{
	public static void main(String ... Raza){

		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter a Value for Length of Rectangle : " );
		int length = scan.nextInt();

		System.out.print("Enter a Value for Breadth of Rectangle : " );
		int breadth = scan.nextInt();
	
		int area = length*breadth;

		System.out.print("\nArea of  Rectangle is : " + area );


		scan.close();

	}


}