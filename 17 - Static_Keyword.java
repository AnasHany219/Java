package static_keyword;

public class Static_Keyword {   // OuterClass

    public static class Student {   // StaticClass | InnerClass | NestedClass

        int No;
        String Name;
        static int Count = 1;               // Static variable
        static String Collage = "MUFCI";    // Static variable

        public Student(String Name) {
            this.No = Count;
            this.Name = Name;
            Increase_Counter();
        }

        static void Increase_Counter() {     // Static static Method
            Count++;
        }

        public String toString() {
            return "Student{" + "No = " + No + ", Name = " + Name + ", Collage = " + Collage + '}';
        }

    }

    static {
        // Static block in java is used to initialize the default value of static variables.
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student("Anas");
        Student st2 = new Student("Islam");

        // The InnerClass can be called like this.
        Static_Keyword.Student st3 = new Static_Keyword.Student("Amjad");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

    }
}
