/*
 * syntax: throw new Exception_Class("Error Message");
 * 
 */
public class ThrowDemo {
    int n,d;
    int Validate ( int n , int d){
        this.n = n;
        this.d = d;
        if ( d == 0)
            throw new ArithmeticException("Error: Division by 0 attempted.");
        else return n/d;
    }
    
  
    public static void main(String[] args) {
        ThrowDemo d = new ThrowDemo();
        try {
            d.Validate(4, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(" 4/2 is: "+ d.Validate(4, 2));
        }

    }
}
