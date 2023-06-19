//2. Write a Java program to enter two numbers and find their sum.
import java.util.Scanner;

class Sum{
	public static void main(String... Masoom){

	Scanner scan =  new Scanner(System.in);

	System.out.print("Enter a Number for a : ");
	int a = scan.nextInt();

	System.out.print("\nEnter a Number for b : ");
	int b = scan.nextInt();
   
      int sum = a+b;

      System.out.println("\nSum of A and B is :  " + sum );



	  scan.close();


	}


}
