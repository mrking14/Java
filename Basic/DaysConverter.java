// 10. Write a Java program to convert days into years, weeks and days.
import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Days for Convert into Years, Weeks & Days : ");

        int days = scan.nextInt();

        if (days >7) {
            if(days >365){
                int left = days % 365;
                int year = days / 365;
                System.out.println("year : " + year);

                if(left>7){
                    int day = left%7;
                    int week = left /7;

                    System.out.println("Week : " +week);

                    System.out.println("Days : " +day);


                }else{
                    System.out.println("Days : " + left);
                }
                

            }else{
            int day = days%7;
            int week = days/7;

            System.out.println("Week : " + week);
            System.out.println("Days : " + day);
            
            }

            
        }else{
            System.out.println("Days : " + days);
        }
        



        scan.close();
    }
    
}
