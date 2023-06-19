// 16. Write a Java program to enter marks of five subjects and calculate total, average and percentage. 

import java.util.Scanner;

public class AveMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Marks of Maths : ");
        int math = scan.nextInt();

        System.out.println("Enter your Marks of Physics : ");
        int physics = scan.nextInt();

        System.out.println("Enter your Marks of Chemestry : ");
        int  chemestry = scan.nextInt();

        System.out.println("Enter your Marks of English: ");
        int english = scan.nextInt();

        System.out.println("Enter your Marks of Hindi: ");
        int hindi = scan.nextInt();

        float average= (float)(math+physics+chemestry+english+hindi)/5;

        System.out.println("Your Average Marks is : " + average);

        scan.close();

    }
    
}
