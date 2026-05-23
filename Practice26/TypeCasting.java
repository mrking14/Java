class TypeCasting{
    public static void main (String[] args){

        // Widening (implicit Type Casting)

        byte butenumber = 100;
        int integernumber = butenumber;
        System.out.println("Widening (implicit Type Casting)");
        System.out.println("Byte value: " + butenumber);
        System.out.println("Integer value: " + integernumber);

        // Narrowing (explicit Type Casting)
        double doublenumber = 3.14;
        int intnumber = (int) doublenumber;
        System.out.println("\nNarrowing (explicit Type Casting)");
        System.out.println("Double value: " + doublenumber);
        System.out.println("Integer value: " + intnumber);


        int narrowinByte= 128;
        byte narrowInt = (byte) narrowinByte;

        System.out.println("\n Narrowing (explicit Type Casting) with overflow");
        System.out.println("Integer value: " + narrowinByte);
        System.out.println("Byte value: " + narrowInt);

        //float to integer

        float floatNum = 2853.256445f;

        System.out.println("Givem floating Number is : "+ floatNum);

        int integerNum = (int)  floatNum;

        System.out.println("Integer Value after being narrowed: " + integerNum);

    }
}