package oops_questions;
class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("  ");
    }
}

class Mango extends Fruit {
    public Mango(String size) {
        super("Mango", "sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("mango is sweet .");
    }
}

class Banana extends Fruit {
    public Banana(String size) {
        super("Banana", "mild", size);
    }

    @Override
    public void eat() {
        System.out.println("banana is soft");
    }
}

public class Qu6 {
    public static void main(String[] args) {
        Mango mango = new Mango("large");
        Banana banana = new Banana("medium");

        mango.eat();
        banana.eat();
    }
} 
    