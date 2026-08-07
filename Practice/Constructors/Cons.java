public class Cons {
    int a;
    int b;
    int c;
    
    public Cons(){
        this.a=5;
        this.b=6;
        this.c=a+b;
    }
     
    void july(){
        System.out.println("first number is "+this.a);

        System.out.println("Second number is "+this.b);
        System.out.println("Sum is "+this.c);
    }
    public static void main(String[] args) {
        Cons s= new Cons();
        s.july();
        
    }
    
    
}