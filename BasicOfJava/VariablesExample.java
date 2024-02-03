public class VariablesExample {

    public static void main(String[] args) {

        // Example 1: Narrowing (Typecasting)

        float f = 10.5f;
        // int a = f; // This will be Compile time error, so we use below line to typecast
        int a = (int) f;
        System.out.println("Original float value (f): " + f);
        System.out.println("Typecasted int value (a): " + a);
        System.out.println();

        // Example 2: Overflow

        int overflowValue = 130;
        byte overflowResult = (byte) overflowValue; //byte data type range is between -128 to 127
        System.out.println("Original int value (overflowValue): " + overflowValue);
        System.out.println("Overflowed byte value (overflowResult): " + overflowResult);
        System.out.println();

        // Example 3: Adding Lower Type

        byte x = 10;
        byte y = 10;
        // byte z = x + y; // Compile Time Error: because x + y = 20 will be int
        byte z = (byte) (x + y);
        System.out.println("Original byte values (x, y): " + x + ", " + y);
        System.out.println("Typecasted byte value after addition (z): " + z);
    }

}
