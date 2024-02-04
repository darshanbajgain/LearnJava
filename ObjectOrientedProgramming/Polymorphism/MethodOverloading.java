public class MethodOverloading {

    public void add (int a, int b) {
        int result = a + b ;
        System.out.println("a + b = " + result);
    }
    public void add (int a, int b, int c) {
        int result = a + b + c ;
        System.out.println("a + b + c = " + result);
    }
    public static void main ( String args[]){
        MethodOverloading adding = new MethodOverloading();
        adding.add(5, 6);
        adding.add(5, 20, 2);
    }
}
