package oopsPractice;
class Car{
      String brand;
      String color;
   
      public void start(){
         System.out.println("Car is starting");
      }
      private void stop(){
         System.out.println("Car is stopping");
      }

      void running(){
         System.out.println("Car is running");
         stop();
      }

      protected void honk(){
         System.out.println("Car is honking");
      }
}