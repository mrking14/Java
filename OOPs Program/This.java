/**
  this :-  This keyword in java is referece variable. it refer to current Reference id(object) of class.
      
    Use of this keyword:--       Whenever class variable & Local variable is same. The Date member of class Shadowed by the local variable of method then use this keyword.  
            *> this keyword can't use in static Function. 
            *> this can be used for calling a constructor from another constructor.
         
  Data Shadowing:-- Whenever class variable local variable are same the this concept is known as data shadowing.
          
  
  */

// Program without this keyword...

public class This {
    int x=20;
    void show(int y, This t1){
        int x=20;
        System.out.println("This Reference ID of t1 : "+t1);
        System.out.println("class Level x " + t1.x);
        System.out.println("x local = "+x);
        System.out.println("y : "+y);
        System.out.println("The Reference id of this :"+this);

    }
    public static void main(String[] args) {
        This obj = new This();
        System.out.println("The Reference id of obj "+obj);
        System.out.println("class level x  "+obj.x);
        obj.show(30,obj);

        This obj1= new This();
        System.out.println("The Reference id of obj1 "+obj1);
        System.out.println("class level x  "+obj1.x);
        obj1.show(30,obj1);
    }

    
}


// using This Keyword................

class This1{
    int x = 10;
    void show(int y){
        int x=20;
        System.out.println("The Reference id of this "+this );
        System.out.println("class level x " +this.x);
        System.out.println("x local =" +x);
        System.out.println("y="+y);
    }

    void setX(int x){
        this.x=x;
    }

    public static void main(String[] args) {
        This1 obj = new This1();
        System.out.println("The Reference id of obj "+obj);
        System.out.println("class level main x="+ obj.x);
        obj.setX(200);

        System.out.println("Update value of Date member for each object");
        obj.setX(700);
        obj.show(14);
        obj.setX(1000);
        obj.show(250);
    }
}
