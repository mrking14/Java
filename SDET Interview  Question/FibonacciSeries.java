import java.util.Scanner;

class FibonacciSeries{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("ENter the limit for Fibonacci series: ");
        int num = scan.nextInt();
        int start = 0;
        int end = 1;

        System.out.println("The Series is : "+ start  +", " +end+ ", ");

        for(int i =1; i<=num; i++){

            int next = start+end;
            System.out.println(next + ", ");

            start=end;
            end = next;

        }

        scan.close();
    }
}