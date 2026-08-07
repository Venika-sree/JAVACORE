class Book {

    private int bookId;
    private String bookName;
    private String author;
    private double price;

   
    Book() {

        bookId = 0;
        bookName = "Not Available";
        author = "Not Available";
        price = 0.0;
    }

    

    Book(int bookId, String bookName, String author, double price) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    // Getter Methods

    public int getBookId() {

        return bookId;
    }

    public String getBookName() {

        return bookName;
    }

    public String getAuthor() {

        return author;
    }

    public double getPrice() {

        return price;
    }

    // Setter Methods

    public void setBookId(int bookId) {

        this.bookId = bookId;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public void setPrice(double price) {

        this.price = price;
    }

   

    public void displayBook() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


//PART C 
// Inheritance

class Person {

    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void displayPerson() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


// Student inherits Person

class Student extends Person {

    int rollNo;

    Student(String name, int age, int rollNo) {

        super(name, age);

        this.rollNo = rollNo;
    }

    void displayStudent() {

        displayPerson();

        System.out.println("Roll Number: " + rollNo);
    }
}


// Faculty inherits Person

class Faculty extends Person {

    String department;

    Faculty(String name, int age, String department) {

        super(name, age);

        this.department = department;
    }

    void displayFaculty() {

        displayPerson();

        System.out.println("Department: " + department);
    }
}


// PART D
// Method Overloading

class Area {

    

    int calculateArea(int side) {

        return side * side;
    }

    // Area of Rectangle

    int calculateArea(int length, int breadth) {

        return length * breadth;
    }

    // Area of Circle

    double calculateArea(double radius) {

        return 3.14 * radius * radius;
    }
}


//  PART D
// Method Overriding

class Vehicle {

    void display() {

        System.out.println("This is a Vehicle");
    }
}


class Car extends Vehicle {

    @Override

    void display() {

        System.out.println("This is a Car");
    }
}


class Bike extends Vehicle {

    @Override

    void display() {

        System.out.println("This is a Bike");
    }
}



// Abstraction

abstract class Shape {

    abstract void draw();
}


class Circle extends Shape {

    @Override

    void draw() {

        System.out.println("Drawing a Circle");
    }
}


class Rectangle extends Shape {

    @Override

    void draw() {

        System.out.println("Drawing a Rectangle");
    }
}


// Interface

interface Printable {

    void print();
}


class Report implements Printable {

    @Override

    public void print() {

        System.out.println("Printing Library Report");
    }
}




public class LibraryManagementSystem {

    public static void main(String[] args) {


        //  PART A

        System.out.println(" PART A: CLASSES AND OBJECTS");

        Book book1 = new Book(101, "Java Programming", "James Gosling", 500.0);

        Book book2 = new Book(102, "Data Structures", "Mark Allen", 600.0);

        System.out.println("\nBook 1 Details:");

        book1.displayBook();

        System.out.println("\nBook 2 Details:");

        book2.displayBook();


        // PART B

        System.out.println("\n PART B: CONSTRUCTORS AND ENCAPSULATI");

        Book book3 = new Book();

        book3.setBookId(103);

        book3.setBookName("Operating Systems");

        book3.setAuthor("Abraham Silberschatz");

        book3.setPrice(700.0);

        System.out.println("\nBook Details Using Getters:");

        System.out.println("Book ID: " + book3.getBookId());

        System.out.println("Book Name: " + book3.getBookName());

        System.out.println("Author: " + book3.getAuthor());

        System.out.println("Price: " + book3.getPrice());


        // PART C

        System.out.println("\n PART C: INHERITANCE");

        Student student = new Student("Ravi", 20, 101);

        System.out.println("\nStudent Details:");

        student.displayStudent();


        Faculty faculty = new Faculty("Kumar", 40, "Computer Science");

        System.out.println("\nFaculty Details:");

        faculty.displayFaculty();


        // PART D

        System.out.println("\n PART D: METHOD OVERLOADING ");

        Area area = new Area();

        int squareArea = area.calculateArea(5);

        int rectangleArea = area.calculateArea(10, 5);

        double circleArea = area.calculateArea(7.0);

        System.out.println("Area of Square: " + squareArea);

        System.out.println("Area of Rectangle: " + rectangleArea);

        System.out.println("Area of Circle: " + circleArea);


        //PART D 

        System.out.println("\nMETHOD OVERRIDING ");

        Vehicle vehicle1 = new Car();

        Vehicle vehicle2 = new Bike();

        vehicle1.display();

        vehicle2.display();


        //  PART E

        System.out.println("\n PART E: ABSTRACTION ");

        Shape shape1 = new Circle();

        Shape shape2 = new Rectangle();

        shape1.draw();

        shape2.draw();


        // INTERFACE
        System.out.println("\nINTERFACE ");

        Printable report = new Report();

        report.print();
    }
}
