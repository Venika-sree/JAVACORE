public class ClassCastDemo {
    public static void main(String[] args) {
        Object obj = "Hello";

        try {
            Integer num = (Integer) obj;
            System.out.println(num);
        }
        catch (ClassCastException e) {
            System.out.println("Invalid type casting");
        }
    }
}