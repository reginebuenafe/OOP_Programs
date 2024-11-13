import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster {
    private List<Employee> emplist;

    public EmployeeRoster() {
        emplist = new ArrayList<>();
    }

    public EmployeeRoster(List<Employee> initialEmployees) {
        emplist = new ArrayList<>(initialEmployees);
    }

    public EmployeeRoster(int initialCapacity) {
        emplist = new ArrayList<>(initialCapacity);
    }

    public List<Employee> getEmployeeList() {
        return emplist;
    }

    public boolean addEmployee(Employee e) {
        return emplist.add(e);
    }

    public Employee removeEmployee(int id) {
        for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i).getEmpID() == id) {
                return emplist.remove(i);
            }
        }
        return null;
    }

    public int countHE() {
        return (int) emplist.stream().filter(e -> e instanceof HourlyEmployee).count();
    }

    public int countCE() {
        return (int) emplist.stream().filter(e -> e instanceof CommissionEmployee && !(e instanceof BasedPlusCommissionEmployee)).count();
    }

    public int countBCPE() {
        return (int) emplist.stream().filter(e -> e instanceof BasedPlusCommissionEmployee).count();
    }

    public int countPWE() {
        return (int) emplist.stream().filter(e -> e instanceof PieceWorkerEmployee).count();
    }

    public void displayHE() {
        emplist.stream().filter(e -> e instanceof HourlyEmployee).forEach(System.out::println);
    }

    public void displayCE() {
        emplist.stream().filter(e -> e instanceof CommissionEmployee).forEach(System.out::println);
    }

    public void displayBCPE() {
        emplist.stream().filter(e -> e instanceof BasedPlusCommissionEmployee).forEach(System.out::println);
    }

    public void displayPWE() {
        emplist.stream().filter(e -> e instanceof PieceWorkerEmployee).forEach(System.out::println);
    }

    public void displayAllEmp() {
        if (emplist.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        System.out.printf("%-15s %-20s %-30s %-20s\n", "Employee ID", "Employee Name", "Employee Type", "Salary");
        System.out.println("--------------------------------------------------------------------------------------------");

        for (Employee e : emplist) {
            String employeeType = e.getClass().getSimpleName();
            double salary = e.computeSalary();
            System.out.printf("%-15d %-20s %-30s %-20.2f \n", e.getEmpID(), e.getEmpName(), employeeType, salary);
        }
    }

}
