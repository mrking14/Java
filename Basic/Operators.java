//3 . Write a Java program to enter two numbers and perform all arithmetic operations.

import java.util.Scanner;
class Operators{
	public static void main(String ... Masoom){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for a : ");
		int a = input.nextInt();

		System.out.print("\nEnter a Value for b : " );
		int b = input.nextInt();

		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int rem = a%b;

		System.out.println("\nThe Addition of A and B is : " + sum );
		System.out.println("The Substraction of A and B is : " + sub );
		System.out.println("The Multiplication of A and B is : " + mul);
		System.out.println("The Division of A and B is : " + div);
		System.out.println("The Remider  of Modulo  A and B is : " + rem );


		input.close();

	}
}