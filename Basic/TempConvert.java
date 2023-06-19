import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Celsius to Fahrenhiet Enter 1 :");
        System.out.println("Fahrenhiet to Celsius Enter 2 :");

        int  choice  = scan.nextInt();

        System.out.println("Enter Temprature for Conversion : ");
        int  temp = scan.nextInt();

        float celsius =    (float) (temp-32 )* 5/9;
        float fahrenheit = ((float)temp * 9/5) + 32;



        switch (choice ) {
            case 1:
            System.out.println("Temprature in Fahrenhiet is : " + fahrenheit);

                break;
        
            case 2:
            System.out.println("Temprature in Celsius is : " + celsius);
                break;
        }

        scan.close();


    }

}
