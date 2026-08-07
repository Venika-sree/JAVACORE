class Calculate {
    int add(int a,int b) {
        return a+b;
    }
    int add(int a,int b,int c) {
        return a+b+c;
    }
   
}


public class Oveerloading {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        System.out.println("Sum of 2 integers is " + obj.add(10, 20));
        System.out.println("Sum of 3 integers is " + obj.add(10, 20, 30));
    }
}