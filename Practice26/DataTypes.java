public class DataTypes {
    public static void main(String[] args) {
        byte byeNum=5;
        short shortNum = 10;
        int intNum = 20;
        long longNum = 10000000000L;
        float floatNum = 5.5f;
        double doubleNum = 10.5;
        char charVar = 'A';
        boolean boolVar = true;
        
        System.out.println("Byte value: " + byeNum);
        System.out.println("Minimum value of Byte: " + Byte.MIN_VALUE);
        System.out.println("Maximum value of Byte: " + Byte.MAX_VALUE);

        System.out.println("Short value: " + shortNum);
        System.out.println("Minimum value of Short: " + Short.MIN_VALUE);
        System.out.println("Maximum value of Short: " + Short.MAX_VALUE);

        System.out.println("Int value: " + intNum);
        System.out.println("Minimum value of Int: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of Int: " + Integer.MAX_VALUE);

        System.out.println("Long value: " + longNum);
        System.out.println("Minimum value of Long: " + Long.MIN_VALUE);
        System.out.println("Maximum value of Long: " + Long.MAX_VALUE);

        System.out.println("Float value: " + floatNum);
        System.out.println("Minimum value of Float: " + Float.MIN_VALUE);
        System.out.println("Maximum value of Float: " + Float.MAX_VALUE);

        System.out.println("Double value: " + doubleNum);
        System.out.println("Minimum value of Double: " + Double.MIN_VALUE);
        System.out.println("Maximum value of Double: " + Double.MAX_VALUE);

        System.out.println("Char value: " + charVar);
        System.out.println("Minimum value of Char: " + (int)Character.MIN_VALUE);
        System.out.println("Maximum value of Char: " + (int)Character.MAX_VALUE);

        System.out.println("Boolean value: " + boolVar);
        

    } 
}
