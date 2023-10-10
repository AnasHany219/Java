public class JavaApplication1 {

    public static void main(String[] args) {
        // Null Pointer
        try {
            int[] arr = null;
            System.out.println(arr[5]);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        // Number Format
        try {
            System.out.println(Integer.parseInt("string"));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        // Multi Exceptions: Array Index Out Of Bounds | Arithmetic
        try {
            int[] arr = new int[5];
            arr[10] = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        }
        //Finally
        try{
            int []arr = new int[5];
            arr[7] = 5;
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
            return;
        }finally{
            System.out.println("Finally");
        }
    }
}
