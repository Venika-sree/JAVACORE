interface Area {
    int calculate(int length, int breadth);
}

interface Perimeter {
    int calculate(int side);
}

class Rectangle implements Area, Perimeter {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int calculate(int length, int breadth) {
        return length * breadth;
    }

    @Override
    public int calculate(int side) {
        return 4 * side;
    }

    int calculate() {
        return length * breadth;
    }
}

public class C1ImplementsI1I2 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(10, 5);

        int area = obj.calculate(10, 5);
        int perimeter = obj.calculate(5);
        int area2 = obj.calculate();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area using overloaded method: " + area2);
    }
}
