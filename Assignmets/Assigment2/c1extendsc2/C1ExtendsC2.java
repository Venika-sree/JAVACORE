class Interest {
    int p;
    int t;

    Interest(int p, int t) {
        this.p = p;
        this.t = t;
    }

    void calculate() {
        System.out.println("Calculating Interest");
    }

    void calculate(int p, int t, int r) {
        int si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

class SimpleInterest extends Interest {
    int r;

    SimpleInterest(int p, int t, int r) {
        super(p, t);
        this.r = r;
    }

    @Override
    void calculate() {
        int si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
    }

    void calculate(int p, int t) {
        int si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

public class C1ExtendsC2 {
    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest(5000, 2, 5);

        obj.calculate();
        obj.calculate(6000, 4);
        obj.calculate(500, 5, 3);
    }
}