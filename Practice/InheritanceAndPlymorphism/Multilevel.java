class Marks {
    int total(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }
}

class Average extends Marks {
    float cal_avg(int total) {
        return total / 3.0f;
    }
}

class Displa extends Average {
    void show(float average) {
        System.out.println("Average is " + average);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Displa obj = new Displa();

        int result = obj.total(10, 65, 26);
        float avg = obj.cal_avg(result);
        obj.show(avg);
    }
}