import java.util.Scanner;

class ConditionPractice{

    public static void main(String[] args ){

        // If condition practice

        int age = 26;

        if(age>20){
            System.out.println("Your are "+ age+" years old");
        }

        // if Else condition
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int voterAge = scan.nextInt();

        if(voterAge >= 18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");     
        }

        //  If Else ladder condition Practice
        System.out.println("Enter Your birth month:");
        byte birthMonth = scan.nextByte();

        if(birthMonth == 1){
            System.out.println("Your birth month is January");
        }else if(birthMonth == 2){
            System.out.println("Your birth month is February");
        }else if(birthMonth == 3){
            System.out.println("Your birth month is March");
        }else if(birthMonth == 4){
            System.out.println("Your birth month is April");
        }else if(birthMonth == 5){
            System.out.println("Your birth month is May");
        }else if(birthMonth == 6){
            System.out.println("Your birth month is June");
        }else if(birthMonth == 7){
            System.out.println("Your birth month is July");
        }else if(birthMonth == 8){
            System.out.println("Your birth month is August");
        }else if(birthMonth == 9){
            System.out.println("Your birth month is September");
        }else if(birthMonth == 10){
            System.out.println("Your birth month is October");
        }else if(birthMonth == 11){
            System.out.println("Your birth month is November");
        }else if(birthMonth == 12){  
            System.out.println("Your birth month is December");
        }else{
            System.out.println("Invalid month entered");
        }


        //  Switch case condition Practice

        int day = 6;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day entered");
        }


        scan.close();

    }

}
