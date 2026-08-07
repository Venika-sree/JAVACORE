class Add{
    int addi(int x, int y){
        int result= x+y;
        return result;
        
    }

    int sub(int a, int b){
        int res= a-b;
        return res;
    }
}

public class Nivi {
    public static void main(String[] args) {
        Add a1= new Add();
        System.out.println("Result is " +a1.addi(2,5));
        System.out.println(" Result is " + a1.sub(5, 2)); 
    }
    
}