package week4;
class FarmAnimal {

    void display() {
        System.out.println("Cow:");
        System.out.println("Stays in Cowshed");
        System.out.println("Eats Grass");
        System.out.println("Sound: Moo");
        System.out.println();

        System.out.println("Pig:");
        System.out.println("Stays in Pigsty");
        System.out.println("Eats Corn");
        System.out.println("Sound: Oink");
        System.out.println();

        System.out.println("Horse:");
        System.out.println("Stays in Stable");
        System.out.println("Eats Grass");
        System.out.println("Sound: Neigh");
    }
}

public class Main {
    public static void main(String[] args) {

        FarmAnimal obj = new FarmAnimal();
        obj.display();
    }
}