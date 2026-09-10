interface Total {
    int calculate(int a, int b, int c);
}

interface Average {
    double calculate(double total, int subjects);
}

interface Result extends Total, Average {
    void display();
}

class Student implements Result {
    int m1;
    int m2;
    int m3;

    Student(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public double calculate(double total, int subjects) {
        return total / subjects;
    }

    @Override
    public void display() {
        int total = calculate(m1, m2, m3);
        double average = calculate((double) total, 3);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    void calculate(int a, int b) {
        System.out.println("Sum of two marks: " + (a + b));
    }
}

public class I1ExtendsI2I3 {
    public static void main(String[] args) {
        Student obj = new Student(80, 75, 90);

        obj.display();
        obj.calculate(80, 75);
    }
}