public class TestClass {
    public static void main(String[] args) {
        EncapsuleClass obj = new EncapsuleClass();
        //can't write obj.name = "Ram"; & obj.age= 22 since name &age are private;
        //so we use below Set methods
        obj.setName("Ram");
        obj.setAge(22);
        //can't write System.out.println(obj.name)
        //so we use get methods
        System.out.println("Name : "+ obj.getName());
        System.out.println("Age : "+ obj.getAge());

    }
}
