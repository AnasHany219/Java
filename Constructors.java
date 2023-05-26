package constructors;

public class Constructors {
    public static class Isosceles_Triangle{       // Class
    
        private float base;
        private float height;
    
        Isosceles_Triangle(){        // Empty Constructor
            System.out.println("First Constructor.");
            base = height = 0;
        }
        Isosceles_Triangle(float b, float h){   // parameterize Constructor
            base = b; 
            height = h;
            System.out.println("Second Constructor.");
        }
        void setBase(float b){       // insert Base
            base = b;
        }
        void setHeight(float h){     // insert Height
            height = h;
        } 
        float area(){                // compute Area
            return (float)(0.5 * base * height);
        }
        float perimeter(){           // compute Perimeter
            return (float) ((base) + (2 * (Math.sqrt((height * height) + (0.5 * base) * (0.5 * base)))));
        }
        void print(){
            System.out.println("Base      = " + base);
            System.out.println("Height    = " + height);
            System.out.println("Area      = " + area());
            System.out.println("Perimeter = " + perimeter());
        }
    };
    public static void main(String[] args) {
        // TODO code application logic here
        Isosceles_Triangle x1 = new Isosceles_Triangle();
        // x1.setBase(8);
        // x1.setHeight(3);
        x1.print();

        Isosceles_Triangle x2 = new Isosceles_Triangle(8, 3);
        x2.print();
    }    
}
/*
------Output------
First Constructor.
Base      = 0.0
Height    = 0.0
Area      = 0.0
Perimeter = 0.0
Second Constructor.
Base      = 8.0
Height    = 3.0
Area      = 12.0
Perimeter = 18.0
*/
