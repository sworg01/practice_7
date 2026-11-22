import java.util.ArrayList;
import java.util.List;

public class Firm {
    private final String name;
    private final Employee director;
    private final List<Department> departments = new ArrayList<Department>();

    public Firm(String name, Employee director) {
        this.name = name;
        this.director = director;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public Employee getDirector() {
        return director;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    // Тестова фірма, спільна для всіх трьох задач
    public static Firm createSample() {
        Firm firm = new Firm("TechCorp", new Employee("Іван", "Петренко", 9000));

        Department dev = new Department("Розробка", new Employee("Олег", "Коваль", 5000));
        dev.addEmployee(new Employee("Марія", "Шевченко", 4200));
        dev.addEmployee(new Employee("Андрій", "Бондар", 5500)); // більше ніж у начальника

        Department hr = new Department("Кадри", new Employee("Ольга", "Мельник", 3500));
        hr.addEmployee(new Employee("Наталя", "Ткач", 2800));
        hr.addEmployee(new Employee("Петро", "Кравчук", 3000));

        firm.addDepartment(dev);
        firm.addDepartment(hr);
        return firm;
    }
}
