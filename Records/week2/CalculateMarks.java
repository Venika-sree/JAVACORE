package week2;
import java.util.Scanner;

class Marks {
    int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    double calculateAverage(int total) {
        return total / 5.0;
    }
}

public class CalculateMarks {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        Marks obj = new Marks();

        int total = obj.calculateTotal(m1, m2, m3, m4, m5);
        double average = obj.calculateAverage(total);

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }
}