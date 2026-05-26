package oopsPractice;

public class AccessModifierPrac {
    
   public static void main(String[] var0) {
      Car var1 = new Car();
      var1.brand = "BMW";
      var1.color = "Black";
      System.out.println(var1.brand);
      System.out.println(var1.color);
      var1.start();
      var1.running(); 
      var1.honk();
   }


    
}
