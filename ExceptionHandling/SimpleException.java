public class SimpleException {
    public static void main( String [] args){
        int numerator = 5;
        int denominator = 0;
        try {
            int result = numerator/ denominator;
        }
        catch ( ArithmeticException e){
            System.out.println("Exception occured: "+ e.getMessage());
        }
        finally {
            System.out.println("This is finally block, always executes");

        }
    }
}