import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Задача 3: список усіх співробітників фірми (з начальниками та директором).
// Спосіб перегляду: b) типізований ітератор.
public class Task3 {

    public static List<Employee> getAllEmployees(Firm firm) {
        List<Employee> result = new ArrayList<Employee>();
        result.add(firm.getDirector());

        Iterator<Department> depIt = firm.getDepartments().iterator();
        while (depIt.hasNext()) {
            Department department = depIt.next();
            result.add(department.getHead());

            Iterator<Employee> empIt = department.getEmployees().iterator();
            while (empIt.hasNext()) {
                result.add(empIt.next());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Firm firm = Firm.createSample();
        System.out.println("Усі співробітники фірми:");
        for (Employee e : getAllEmployees(firm)) {
            System.out.println("  " + e);
        }
    }
}
