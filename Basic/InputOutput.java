//1. Java program to perform input output of all basic data types.
import java.util.Scanner;
class InputOutput{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Your name : ");

	String name = input.nextLine();


	System.out.println("Welcome To The Java World !" );

	System.out.println("Your name is " + name);

	input.close();
	

	}




}