/*
 * best example to show all the keywords;
 * syntax: methodName() throws exceptionName { // define conditions //}
 */
public class ThrowsExample {

    public int Divide(int n, int d) throws ArithmeticException {

        if (d == 0)
            throw new ArithmeticException("Division by 0 not possible");

        return n / d;
    }

    public static void main(String[] args) {
        ThrowsExample ex = new ThrowsExample();

        try {
            ex.Divide(5, 0);
        }
        catch (Exception e) {
            System.out.println("Reuslt for 5/0, Exception occured: "+ e.getMessage());
        }
        finally {
            System.out.println("Result for 8/2 : " + ex.Divide(8, 2));
        }

    }
}
