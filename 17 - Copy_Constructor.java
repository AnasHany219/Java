package copy_constructor;

public class Copy_Constructor{
    public static class Copy{
        private int a1, a2, a3;
        Copy(int aa1, int aa2, int aa3){
            a1 = aa1;
            a2 = aa2;
            a3 = aa3;
        }
        Copy(Copy value){
            this (value.a1, value.a2, value.a3);
        }
        void print(){
            System.out.println(a1 + " " + a2 + " " + a3);
        }
    };

    public static void main(String[] args) {
        // TODO code application logic here
        Copy g = new Copy(1, 2, 3);
        g.print();    // 1 2 3
        Copy h = new Copy(g);
        h.print();    // 1 2 3
    }
}
