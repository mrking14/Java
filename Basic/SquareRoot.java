import java.util.Scanner;
class SquareRoot{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Number for Square Root : ");
        int num = scan.nextInt();

        for(int i = 1; i<=num ; i++){
            int num1 = i*i;

            if(i==num){
                System.out.println("Enter a valid Number! ");
            }

            if(num1==num){
                System.out.println("The Square Root is : " + i );
                break;
            }

            

        }

        scan.close();
        




    }
}