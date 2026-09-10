    interface Shape {
    void calculate();
}

class Circle implements Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculate() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void calculate(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }

    void calculate(int radius, double pi) {
        double area = pi * radius * radius;
        System.out.println("Area: " + area);
    }
}

public class C1implementsI1 {
    public static void main(String[] args) {
        Circle obj = new Circle(5);

        obj.calculate();
        obj.calculate(5);
        obj.calculate(5, 3.14159);
    }
} 
    

