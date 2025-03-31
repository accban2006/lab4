import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "Nguyen Van A", 50, 1, 2);
        Employee emp2 = new Employee("E002", "Tran Thi B", 60, 0, 3);
        Employee emp3 = new Employee("E003", "Le Hoang C", 45, 2, 1);
        Employee emp4 = new Employee("E004", "Pham Thu D", 70, 0, 0);
        Employee emp5 = new Employee("E005", "Hoang Minh E", 55, 1, 2);

        System.out.println("--- Weekly Salaries ---");
        System.out.println(emp1.getEmployeeName() + ": " + emp1.calculateWeeklySalary());
        System.out.println(emp2.getEmployeeName() + ": " + emp2.calculateWeeklySalary());
        System.out.println(emp3.getEmployeeName() + ": " + emp3.calculateWeeklySalary());
        System.out.println(emp4.getEmployeeName() + ": " + emp4.calculateWeeklySalary());
        System.out.println(emp5.getEmployeeName() + ": " + emp5.calculateWeeklySalary());

        System.out.println("\n--- Employee Comparison ---");
        System.out.println(emp1.getEmployeeName() + " vs " + emp2.getEmployeeName() + ": " + emp1.compareTo(emp2));
        System.out.println(emp2.getEmployeeName() + " vs " + emp3.getEmployeeName() + ": " + emp2.compareTo(emp3));
        System.out.println(emp1.getEmployeeName() + " vs " + emp5.getEmployeeName() + ": " + emp1.compareTo(emp5)); // Same travel days, different leaving days

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.println("\n--- Employees Before Sorting ---");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees);

        System.out.println("\n--- Employees After Sorting (Ascending Order based on compareTo) ---");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Date startDate = new Date(); 
        Date endDate = new Date(System.currentTimeMillis() + (30L * 24 * 60 * 60 * 1000)); 
        Project projectA = new Project("PROJ001", startDate, endDate);
        projectA.addEmployee(emp1);
        projectA.addEmployee(emp3);
        projectA.addEmployee(emp5);

        Project projectB = new Project("PROJ002", new Date(System.currentTimeMillis() - (15L * 24 * 60 * 60 * 1000)), endDate); // Start date 15 days ago
        projectB.addEmployee(emp2);
        projectB.addEmployee(emp4);

        System.out.println("\n--- Project Budgets ---");
        System.out.println(projectA);
        System.out.println("Estimated Budget for " + projectA.getProjectid() + ": " + projectA.estimateBudget());
        System.out.println(projectB);
        System.out.println("Estimated Budget for " + projectB.getProjectid() + ": " + projectB.estimateBudget());

        System.out.println("\n--- Modifying Employee Attributes ---");
        System.out.println("Before modification: " + emp1);
        emp1.setSalaryPerHour(55);
        emp1.setNoOfLeavingDay(0);
        System.out.println("After modification: " + emp1);
        System.out.println("Weekly Salary after modification: " + emp1.calculateWeeklySalary());
    }
}