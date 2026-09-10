class Employee {
    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    void calculate() {
        System.out.println("Salary: " + salary);
    }

    void calculate(int salary) {
        System.out.println("Salary: " + salary);
    }
}

interface Bonus {
    int calculateBonus(int salary);
}

class Manager extends Employee implements Bonus {
    Manager(int salary) {
        super(salary);
    }

    @Override
    void calculate() {
        System.out.println("Salary: " + salary);
    }

    @Override
    public int calculateBonus(int salary) {
        return salary * 10 / 100;
    }

    void calculate(int salary, int bonus) {
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class C1ExtendsC2ImplementsI1 {
    public static void main(String[] args) {
        Manager obj = new Manager(50000);

        obj.calculate();

        int bonus = obj.calculateBonus(50000);

        obj.calculate(50000, bonus);
    }
}