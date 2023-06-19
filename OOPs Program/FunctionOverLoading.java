/** Compile Time Polymorphism :-  Whenever an object bind with there Functionality at compile time is known as Compile Time polymorphism.
  
  
  Function Overloading:-   You can have more than one function with same name but different prototypes within Same Class .
  
  
          Prototypes:-
              *> Access modifier.(Ststic , final)
              *> Access Specifier.(Public , Private, Protected)
              *> Function Arguments.(Sequence Of Argument)
              *> Return Type.
 */

public class FunctionOverLoading {
    void show(){
        System.err.println("This is Empty Method.");

    }
    void show(int x){
        System.out.println("The value Of X : " +x);
    }

    void show(String name){
        System.out.println("Your Name is : "+name);
    }

    //Argument Sequence Defferent

    void returns(int m, long n){
        System.out.println("Integer Argument "+m +"     Long Argument "+n);
    }
    void returns(long m, int n){
        System.out.println("Long Argument "+m +"        Integer Argument "+n);
    }
    public static void main(String[] args) {
        FunctionOverLoading obj = new FunctionOverLoading();
        obj.show();
        obj.show("Masoom raza");
        obj.show(14);

        obj.returns(14, 24L);
        obj.returns(24L,14);
        
    }
    
}
