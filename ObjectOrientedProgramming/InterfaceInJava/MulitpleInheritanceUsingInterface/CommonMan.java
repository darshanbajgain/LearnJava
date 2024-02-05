package MulitpleInheritanceUsingInterface;
//here created two interfaces Person and Students and implemented on Class Commonman to inherit methods of these interfaces;
public class CommonMan implements Person, Student {
    public void work(){
        System.out.println("Works and ");
    }
    public void study(){
        System.out.println("Study");
    }
    public static void main(String[] args) {
        CommonMan obj = new CommonMan();
        obj.work();
        obj.study();
    }

}
