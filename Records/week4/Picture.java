package week4;

class Order {
    String date;
    String number;

    void confirm() {
        System.out.println("Order confirmed");
    }

    void close() {
        System.out.println("Order closed");
    }
}

class Customer {
    String name;
    String location;

    void sendOrder() {
        System.out.println("Order sent");
    }

    void receiveOrder() {
        System.out.println("Order received");
    }
}

class SpecialOrder extends Order {

    void dispatch() {
        System.out.println("Special order dispatched");
    }
}

class NormalOrder extends Order {

    void dispatch() {
        System.out.println("Normal order dispatched");
    }

    void receive() {
        System.out.println("Normal order received");
    }
}

public class Picture {
    public static void main(String[] args) {

        Customer customer = new Customer();

        SpecialOrder special = new SpecialOrder();
        NormalOrder normal = new NormalOrder();

        customer.sendOrder();

        special.confirm();
        special.dispatch();
        special.close();

        normal.confirm();
        normal.dispatch();
        normal.receive();
        normal.close();

        customer.receiveOrder();
    }
}