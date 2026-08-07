class Number{
    int x=5;
}

class Sqaure extends Number{
    void cal_sqaure(){
        int sq=x*x;
        System.out.println("Sqaure is "+sq);
    }

}

class Cube extends Number{
    void cal_cube(){
        int cube=x*x*x;
        System.out.println("Cube is "+cube);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Sqaure ob1=new Sqaure();
        Cube ob2= new Cube();
        ob1.cal_sqaure();
        ob2.cal_cube();
    }
    
}