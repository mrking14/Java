// 8. Write a Java program to enter temperature in Celsius and convert it into Fahrenheit.



import java.util.Scanner;


public class TempCtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Temprature in Celcius : ");
        int celcius = input.nextInt();

        float fahrenheit = ((float)celcius * 9/5) +32;

        System.out.println("The Tempreture in Fahrenheit is : " + fahrenheit);

        input.close();


        
    }

    
}