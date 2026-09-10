class Shape {
    int value;

    Shape(int value) {
        this.value = value;
    }

    void calculate() {
        System.out.println("Value: " + value);
    }
}

class Circle extends Shape {

    Circle(int radius) {
        super(radius);
    }

    @Override
    void calculate() {
        double area = 3.14 * value * value;
        System.out.println("Radius: " + value);
        System.out.println("Area of Circle: " + area);
    }
}

class Square extends Shape {

    Square(int side) {
        super(side);
    }

    @Override
    void calculate() {
        int area = value * value;
        System.out.println("Side: " + value);
        System.out.println("Area of Square: " + area);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);

        c.calculate();
        s.calculate();
    }
}
