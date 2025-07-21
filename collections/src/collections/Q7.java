package collections;
import java.util.*;
class Employe {
    int id;
    String name;
    double salary;

    Employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Emp id: " + id + ", Name: " + name + ", Salary: ₹" + salary;
    }
}
public class Q7 {
    public static void main(String[] args) {
        Vector<Employe> vec = new Vector<>();
        vec.add(new Employe(101, "Moksh", 20000));
        vec.add(new Employe(102, "Manju", 30000));
        vec.add(new Employe(103, "Anji", 50000));

        System.out.println("=== Using Iterator ===");
        Iterator<Employe> itr = vec.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("=== Using Enumeration ===");
        Enumeration<Employe> ee = vec.elements();
        while (ee.hasMoreElements()) {
            System.out.println(ee.nextElement());
        }
    }
}
