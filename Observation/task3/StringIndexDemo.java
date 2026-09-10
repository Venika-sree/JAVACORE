public class StringIndexDemo {
    public static void main(String[] args) {
        String str = "Hello";

        try {
            System.out.println(str.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid string index");
        }
    }
}