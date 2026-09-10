class Shape {
    int length;
    int breadth;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculate() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void calculate() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

class Area extends Rectangle {

    Area(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void calculate() {
        int area = length * breadth;
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Area obj = new Area(10, 5);
        obj.calculate();
    }
}