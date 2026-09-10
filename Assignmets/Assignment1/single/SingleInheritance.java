class Principal {
    int p;
    int t;

    Principal(int p, int t) {
        this.p = p;
        this.t = t;
    }

    void calculate() {
        System.out.println("Principal: " + p);
        System.out.println("Time: " + t);
    }
}

class SimpleInterest extends Principal {
    int r;

    SimpleInterest(int p, int t, int r) {
        super(p, t);
        this.r = r;
    }

    @Override
    void calculate() {
        int si = (p * t * r) / 100;
        System.out.println("Principal: " + p);
        System.out.println("Time: " + t);
        System.out.println("Rate: " + r);
        System.out.println("Simple Interest: " + si);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest(5000, 2, 5);
        obj.calculate();
    }
}