import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its table : ");
        int number = sc.nextInt();




        // For loop practice using print tablle of any number.

        for(int i=1; i<=10; i++){
            System.out.println(number +" X " +i+ " = " + number*i);
        }
        System.out.println("--------------------------------------------------");
        
        // While loop practice using print table of any number.
        
        int num = 288;
        int num1 = 1;
        
        System.out.println("Now we will print the table of 288 using while loop : ");
        while(num1<=10){
            System.out.println(num +" X " +num1+ " = " + num*num1);
            num1++;
       }

        System.out.println("--------------------------------------------------");


        // Do while loop practice using print table of any number.
        int doNum = 1;

        do{
            System.out.println("Masoom Raza ");
            doNum++;
        }while(doNum <= 5);
    
        sc.close();

    }
    
}
