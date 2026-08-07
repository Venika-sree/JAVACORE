interface Addition {
    void add(int a, int b);
}

interface Multiplication extends Addition {
    void multiply(int a, int b);
}

class Calculate implements Multiplication {

    @Override
    public void add(int a, int b) {
        System.out.println("Sum is  " + (a + b));
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Product is " + (a * b));
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {

        Calculate obj = new Calculate();

        obj.add(10, 20);
        obj.multiply(10, 20);
    }
}
