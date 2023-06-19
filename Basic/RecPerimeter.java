//4. Write a Java program to enter length and breadth of a rectangle and find its perimeter.
import java.util.Scanner;
class RecPerimeter{
	public static void main(String ... King){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Value for Length of Rectangle : " );
		int length = scan.nextInt();

		System.out.print("Enter a Value for Breadth of Rectangle : " );
		int breadth = scan.nextInt();


		int perimeter = 2*(length + breadth) ;

		System.out.print("\nThe Perimeter of Rectangle is  : " + perimeter );


		scan.close();
			
	}

}