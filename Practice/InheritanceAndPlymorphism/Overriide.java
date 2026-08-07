class Calc{
    int cal(int a , int b){
        return a+b;
    }
}
class Multiply extends Calc{
    int cal(int a, int b){
        return a*b;
    }

}

public class Overriide {
    public static void main(String[] args) {
        Multiply obj = new Multiply();
        System.out.println(" product is " + obj.cal(5,4));

    }
    
}