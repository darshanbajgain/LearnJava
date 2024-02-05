public class InterfaceImplementation implements interfaceExample {
    //implemented interface in the class
    public float Area(){
        float r = 4.55f;
        return pi*r*r;
    }
    public static void main(String[] args) {
        InterfaceImplementation obj = new InterfaceImplementation();
        System.out.println("Area is "+ obj.Area());
    }
}
