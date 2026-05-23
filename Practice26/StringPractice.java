public class StringPractice {
    public static void main(String[] args){

        String firstName = "Masoom";

        String name = new String("Masoom");

        String lastName = "Raza";

        String yourName = "Masoom";

        System.out.println("First name is :  "+ firstName);
        System.out.println("Last name is :  "+ lastName);


        // String compare with `==` operator.


        if(firstName == yourName){
            System.out.println( firstName +" and " + yourName + " Both are same using == operator");
        }
        else{
            System.out.println(firstName +" and " + yourName + " Both are different using == operator");
        }

        // String compare with `.equals()` method.

        if(firstName.equals(name)){
            System.out.println(firstName + " and " + name + " Both are same using .equals() operator");
        }
        else{
            System.out.println("Both are different using .equals() operator");
        }

        // String Concatination 

        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is : " + fullName);

        // String contains Method

        if(fullName.contains(lastName)){
            System.out.println("Your Full Name contains your tittle : "+ lastName);
        }else{
            System.out.println("Your Full Name does not contains your tittle : "+ lastName);
        }

        // String charAt Method

        System.out.println("The 6th character of your full name is : " + fullName.charAt(5));


        // String substring() Method

        System.out.println("The substring of your full name from index 7 to 11 is : " + fullName.substring(7,11));

        System.out.println("The hash code of your full name is : " + fullName.hashCode());
        System.out.println("The length of your full name is : " + fullName.length());
        System.out.println("The byte array of your full name is : " + fullName.getBytes());
        System.out.println("The Upper Case  of your full name is : " + fullName.toUpperCase());
        System.out.println("The hash code of your full name is : " + fullName.hashCode());
        
        
    }
    
}
