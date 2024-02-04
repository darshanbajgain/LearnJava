public class StaticKeyword {
    /*
     * The static keyword in Java is used for memory management mainly. 
     * We can apply static keyword with variables, methods, blocks and nested classes. 
     * The static keyword belongs to the class than an instance of the class.
     */
    //static inner class
    public static class Person {
        String name;
        int age;
        //static vairable -making company ststic assuming all person works in same company so make static;
        static String company;
        static int count;
        public Person(String name, int age, String cpny){

            this.name = name;
            this.age = age;
            company = cpny;
            count++;
        }

        void display(){
            System.out.println("Name: "+ name+" , Age: "+ age + " , Company: "+ company);
        }

        //static method
        static void displayCount(){
            System.out.println("Count: " + count);
        }

    }

    public static void main(String[] args) {
        System.out.println("Count before creating object:");
        Person.displayCount();// accessing static methods directly by class name 'Person'
        Person p1 = new Person("Ram", 20, "CodeChuckler");
        Person p2 = new Person("Hari", 23, "CodeChuckler");// even if i had different company name here it will show person1 company name as static allocates memory only once
        System.out.println("Count after creating objects:");
        Person.displayCount();
        System.out.println("Displaying records: ");
        p1.display();
        p2.display();
    }
}
