public class thisKeyword {
    /*
     * THIS keyword is a reference variable that refers to the current object.
     * It is used to refer the current class instance variable.
     * It is used for name conflict resolution when parameters and instance variables have same name
     */
    String name;
    int age;
    public thisKeyword(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+ name +" Age: "+ age);
    }
    public static void main(String[] args) {
        thisKeyword ob = new thisKeyword("Ram", 20);
        ob.display();
    }
}
