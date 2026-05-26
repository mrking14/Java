package oopsPractice.threadPractice;

public class Calculation{
    public void add(int a, int b){
        System.out.println("Addition: " + (a+b));
    }

    public void subtract(int a, int b){
        System.out.println("Subtraction: " + (a-b));
    }

    public void countdown(int start){
        for(int i = start; i >= 0; i--){
            System.out.println(i);
        }
    }


}
