interface Arithmetic {
    void calculat(int a, int b);
}

class Addition implements Arithmetic {
     public void calculat(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

class Subtractio implements Arithmetic {
     public void calculat(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class ClassInterfaceExample {
    public static void main(String[] args) {

        Arithmetic obj = new Addition();
        obj.calculat(20, 10);

        
        obj.calculat(20, 10);
    }
}