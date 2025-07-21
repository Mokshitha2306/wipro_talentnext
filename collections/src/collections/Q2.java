package collections;
import java.util.*;
class Employee {
    int empId;
    String empName;
    String gender;
    float salary;

    public Employee(int empId, String empName, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.salary = salary;
    }

    public void getEmployeeAll() {
        System.out.print(empId + " ");
        System.out.print(empName + " ");
        System.out.print(gender + " ");
        System.out.println(salary);
    }
}

class EmployeeDB {
    List<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            if (e.empId == empId) {
                itr.remove();
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "PaySlip for EmpID " + e.empId + ": ₹" + e.salary;
            }
        }
        return "Employee not found.";
    }

    public void printAll() {
        for (Employee emp : list) {
            emp.getEmployeeAll();
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        EmployeeDB emp = new EmployeeDB();

        emp.addEmployee(new Employee(101, "Mokshi", "Female", 200.0f));
        emp.addEmployee(new Employee(102, "Manju", "Male", 300.0f));
        emp.addEmployee(new Employee(103, "Raji", "Female", 400.0f));

        System.out.println("All Employees:");
        emp.printAll();

        
        System.out.println(emp.showPaySlip(101));

        
        System.out.println("Deleted: " + emp.deleteEmployee(102));

        System.out.println("Employees after deletion:");
        emp.printAll();
    }
}
