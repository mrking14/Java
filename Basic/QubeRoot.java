import java.util.Scanner;

public class QubeRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter No. To Qube of It : ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            int qube = i*i*i;
            if (i==number) {
                System.out.println("Please Give a Valide Number !");
                
            }
            if (qube == number) {
                System.out.println("The Qube Root of given number is : " + i);
                break;
                
            }
            
        }

        scan.close();
    }

    
}