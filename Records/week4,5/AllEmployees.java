package week4;

class Employee {

    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Employee";
        salary = 20000;
        promotionStatus = "Not Promoted";
    }

    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        promotionStatus = "Not Promoted";
    }

    Employee(String name, int id, String designation, double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Promotion Status: " + promotionStatus);
        System.out.println();
    }
}

public class AllEmployees
 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ravi", 101);
        Employee e2 = new Employee("Anu", 102, "Manager", 50000);
        Employee e3 = new Employee("Kiran", 103, "Developer", 45000, "Promoted");

        e1.display();
        e2.display();
        e3.display();
    }
}