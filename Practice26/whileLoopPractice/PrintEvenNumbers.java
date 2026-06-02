package whileLoopPractice;

public class PrintEvenNumbers {
    public static void main(String... arg){
        int start = 1;
        while(start <= 100){
            if(start % 2 == 0){
                System.out.println("Even Numbers Is Printed : "+ start);
            }
            start++;
        }
    }
    
}
