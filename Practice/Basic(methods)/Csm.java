public class Csm {
    void hello(int i,int j){
        int x=i;
        int y=j;
        int z=x+y;
        System.out.println("sum is " + z);

    }
    public static void main(String[] args) {
        Csm c=new Csm();
        c.hello(10,20);

    }
    
}