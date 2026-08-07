
class Addition {
    void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
}

class Subtraction extends Addition {
    @Override
    void calculate(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

        Addition obj = new Addition();
        obj.calculate(20, 10);
        obj.calculate(20, 10);
    }
}