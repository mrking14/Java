package whileLoopPractice;
import java.util.Scanner;

public class PrintNumreverse {
    public static void main( String... lol){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print in reverse order: ");
        int startNum = input.nextInt();

        while(startNum>=1){
            System.out.println("Numbers :" + startNum);
            startNum--;
            
        }

        input.close();
    }
}
