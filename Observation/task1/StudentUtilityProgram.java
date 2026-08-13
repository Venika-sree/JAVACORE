import java.util.Scanner;

//  PART A 
class PartA {

    static void studentDetails(Scanner sc) {

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        double marks1 = sc.nextDouble();

        System.out.print("Enter Marks in Subject 2: ");
        double marks2 = sc.nextDouble();

        System.out.print("Enter Marks in Subject 3: ");
        double marks3 = sc.nextDouble();

        double total = marks1 + marks2 + marks3;
        double percentage = total / 3;

        System.out.println("\n--- STUDENT INFORMATION ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}


//PART 

class PartB {

    // Even or Odd

    static void evenOdd(Scanner sc) {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }


    // Largest of Three Numbers

    static void largest(Scanner sc) {

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }
    }


    // Grade using if-else

    static void grade(Scanner sc) {

        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }


    // Day using switch

    static void day(Scanner sc) {

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number");
        }
    }
}


//  PART C 

class PartC {

    // Multiplication Table

    static void multiplicationTable(Scanner sc) {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }


    // Numbers from 1 to N

    static void displayNumbers(Scanner sc) {

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
    }


    // Sum of First N Natural Numbers

    static void sumOfNumbers(Scanner sc) {

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }


    // Fibonacci Series

    static void fibonacci(Scanner sc) {

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}


//PART D

class PartD {

    // Factorial Method

    static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


    // Prime Method

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    // Maximum Method

    static int maximum(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    

    static double areaOfCircle(double radius) {

        return 3.14 * radius * radius;
    }
}


// MAIN CLASS

public class StudentUtilityProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");

            // Part A

            System.out.println("1. Student Information and Result");

            // Part B

            System.out.println("2. Check Even or Odd");
            System.out.println("3. Find Largest of Three Numbers");
            System.out.println("4. Display Grade");
            System.out.println("5. Display Day of the Week");

            // Part C

            System.out.println("6. Print Multiplication Table");
            System.out.println("7. Display Numbers from 1 to N");
            System.out.println("8. Calculate Sum of First N Natural Numbers");
            System.out.println("9. Generate Fibonacci Series");

            // Part D

            System.out.println("10. Find Factorial");
            System.out.println("11. Check Prime Number");
            System.out.println("12. Find Maximum of Two Numbers");
            System.out.println("13. Calculate Area of a Circle");

            System.out.println("14. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();


            switch (choice) {

                // PART A 

                case 1:
                    PartA.studentDetails(sc);
                    break;


                //PART B 

                case 2:
                    PartB.evenOdd(sc);
                    break;

                case 3:
                    PartB.largest(sc);
                    break;

                case 4:
                    PartB.grade(sc);
                    break;

                case 5:
                    PartB.day(sc);
                    break;


                case 6:
                    PartC.multiplicationTable(sc);
                    break;

                case 7:
                    PartC.displayNumbers(sc);
                    break;

                case 8:
                    PartC.sumOfNumbers(sc);
                    break;

                case 9:
                    PartC.fibonacci(sc);
                    break;


                //PART D

                case 10:

                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    long factorialResult = PartD.factorial(number);

                    System.out.println("Factorial = " + factorialResult);

                    break;


                case 11:

                    System.out.print("Enter a number: ");
                    int primeNumber = sc.nextInt();

                    boolean primeResult = PartD.isPrime(primeNumber);

                    if (primeResult) {
                        System.out.println(primeNumber + " is a Prime Number");
                    } else {
                        System.out.println(primeNumber + " is Not a Prime Number");
                    }

                    break;


                case 12:

                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();

                    int maximumResult = PartD.maximum(a, b);

                    System.out.println("Maximum = " + maximumResult);

                    break;


                case 13:

                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();

                    double areaResult = PartD.areaOfCircle(radius);

                    System.out.println("Area of Circle = " + areaResult);

                    break;


                // Exit

                case 14:

                    System.out.println("Program Ended");

                    break;


                // Invalid Choice

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 14);

        sc.close();
    }
}