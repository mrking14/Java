import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any nmber to Check prime number: ");
        int num = scan.nextInt();
        boolean isPrime = true;

        if(num<=1){
            isPrime = false;
        }else{
            for(int i=2; i<=num/2; i++){
                if(num % i ==0){
                    isPrime = false;
                }
            }
        }

        if(isPrime){
            System.out.println("Given Number is Prime number!");
        }else{
            System.out.println("Given Number is not a Prime number!");
        }
                
        scan.close();

    }
    
}
