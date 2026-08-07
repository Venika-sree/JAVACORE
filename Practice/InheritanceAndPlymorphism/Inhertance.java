class Bank{
    float calc_si(float p, int t, float roi){
      float si = (p*t*roi)/100;
      return si;

    }
}

class Display extends Bank{
    void show(float si){
        System.out.println("Simple Intrest is "+si);
    }
}





public class Inhertance{
    public static void main(String[] args) {
        Display obj=new Display();
        float result= obj.calc_si(1000.0f, 3, 5);
        obj.show(result);

    }

}