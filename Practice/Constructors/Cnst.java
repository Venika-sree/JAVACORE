public class Cnst {
    String name;
    int age;
    float marks;

    public Cnst(String a,int i,float  c){
        this.name=a;
        this.age=i;
        this.marks=c;

    }
     void june(){
        System.out.println("Name is " + name);
        System.out.println("age is "+ age);
        System.out.println("Marks are " +marks);
     }
    public static void main(String[] args) {
        Cnst g=new Cnst("Rajesh",12,30.5f);
        g.june();
        

    }
}