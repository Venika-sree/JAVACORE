interface Sunday{
    void day();

  } 
class Mondayy implements Sunday{
    @Override
     public void day(){
        System.out.println("Today is Friday");

    }

} 

public class Interface {
    public static void main(String[] args) {
        Mondayy m= new Mondayy();
        m.day();
        
    }
    
}