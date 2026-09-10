public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int a[] = {10, 20, 30};

        try {
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}