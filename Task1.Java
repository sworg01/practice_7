// Спосіб перегляду: c) типізований цикл for-each.
public class Task1 {

    public static double findMaxSalary(Firm firm) {
        double max = firm.getDirector().getSalary();
        for (Department department : firm.getDepartments()) {
            // начальник відділу теж рахується
            if (department.getHead().getSalary() > max) {
                max = department.getHead().getSalary();
            }
            for (Employee employee : department.getEmployees()) {
                if (employee.getSalary() > max) {
                    max = employee.getSalary();
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Firm firm = Firm.createSample();
        System.out.println("Максимальна зарплата: " + findMaxSalary(firm));
    }
}
