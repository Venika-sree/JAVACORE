class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

interface Area {
    int calculateArea(int length, int breadth);
}

interface Perimeter {
    int calculatePerimeter(int length, int breadth);
}

class Rectangle extends Shape implements Area, Perimeter {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void display() {
        System.out.println("Rectangle");
    }

    @Override
    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    @Override
    public int calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    void calculate(int length) {
        System.out.println("Length: " + length);
    }

    void calculate(int length, int breadth) {
        System.out.println("Area: " + (length * breadth));
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(10, 5);

        obj.display();

        int area = obj.calculateArea(10, 5);
        int perimeter = obj.calculatePerimeter(10, 5);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        obj.calculate(10);
        obj.calculate(10, 5);
    }
}