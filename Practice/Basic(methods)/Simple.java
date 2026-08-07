public class Simple {
    int a;
    int b;
    int c;
    public Simple(){
        this.a=10;
        this.b=20;
        this.c= a+b;
    }
    public Simple(int i, int j){
        this.a=i;
        this.b=j;
        this.c= a+b;
    }
    void ello(){
        System.out.println(" SUm is " +c);

    }
    public static void main(String[] args) {
        Simple s= new Simple();
        Simple d= new Simple(67,120);
        s.ello();
        d.ello();
    }
}