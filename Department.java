import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private final Employee head;
    private final List<Employee> employees = new ArrayList<Employee>();

    public Department(String name, Employee head) {
        this.name = name;
        this.head = head;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
