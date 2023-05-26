package class_person;

public class Class_Person {
    public static class Person{
        private String name;
        int age;
        
        void setName(String n){
            name = n;
        }
        String getName(){
            return name;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person();
        person.setName("Anas");
        person.age = 19;
        System.out.println(person.getName());   // Anas
    }
}
