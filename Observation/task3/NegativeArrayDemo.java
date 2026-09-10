public class NegativeArrayDemo {
    public static void main(String[] args) {
        int size = -5;

        try {
            int a[] = new int[size];
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative");
        }
    }
}