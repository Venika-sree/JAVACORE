interface Shape {
    void display();
}

interface Triangle extends Shape {
    void calculate();
}

class TriangleArea implements Triangle {
    int base;
    int height;

    TriangleArea(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void display() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }

    @Override
    public void calculate() {
        double area = 0.5 * base * height;
        System.out.println("Area: " + area);
    }

    void calculate(int base, int height) {
        double area = 0.5 * base * height;
        System.out.println("Area using overloaded method: " + area);
    }
}

public class I1extendsI2 {
    public static void main(String[] args) {
        TriangleArea obj = new TriangleArea(10, 6);

        obj.display();
        obj.calculate();
        obj.calculate(10, 6);
    }
}