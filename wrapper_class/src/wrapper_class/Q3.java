package wrapper_class;

class Question3 implements Cloneable {
    int age;
    String name;

    public Question3(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("AGE: " + age + ", Name: " + name);
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            Question3 name1 = new Question3(20, "Moksh");
            name1.display();

            Question3 name2 = (Question3) name1.clone();

            name1.age = 21;
            name1.name = "Manju";

            System.out.println("Original:");
            name1.display();

            System.out.println("Cloned:");
            name2.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}
