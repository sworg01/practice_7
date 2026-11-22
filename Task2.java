import java.util.Iterator;

// Задача 2: відділ, де хоча б один працівник заробляє більше за свого начальника.
// Спосіб перегляду: a) нетипізований ітератор !!!
public class Task2 {

    @SuppressWarnings("rawtypes")
    public static Department findDepartmentWithRichEmployee(Firm firm) {
        Iterator depIt = firm.getDepartments().iterator();
        while (depIt.hasNext()) {
            // без generics next() повертає Object, тому потрібне приведення типу
            Department department = (Department) depIt.next();
            Iterator empIt = department.getEmployees().iterator();
            while (empIt.hasNext()) {
                Employee employee = (Employee) empIt.next();
                if (employee.getSalary() > department.getHead().getSalary()) {
                    return department;
                }
            }
        }
        // такого відділу немає
        return null;
    }

    public static void main(String[] args) {
        Firm firm = Firm.createSample();
        Department found = findDepartmentWithRichEmployee(firm);
        if (found != null) {
            System.out.println("Знайдено відділ: " + found.getName());
        } else {
            System.out.println("Такого відділу немає");
        }
    }
}
