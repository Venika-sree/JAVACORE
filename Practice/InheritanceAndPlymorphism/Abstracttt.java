abstract class Demooo {
    int x = 10;

    abstract void show();

    void hello() {
        System.out.println("This is from Abstract class");
        System.out.println("Variable from class is " + x);
    }
}

class Displayyy extends Demooo {

    @Override
    
    void show() {
        System.out.println("A variable from the super class is " + x);
    }
}

public class Abstracttt {
    public static void main(String[] args) {
        Displayyy d = new Displayyy();

        d.hello();
        d.show();     
    }
}
