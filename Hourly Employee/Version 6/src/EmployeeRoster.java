import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster extends Employee {
    private List<Employee> emplist = new ArrayList<>();

    boolean addEmployee(Employee e) {
        return emplist.add(e);
    }

    Employee removeEmployee(int id) {
        for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i).getEmpID() == id) {
                return emplist.remove(i);
            }
        }
        return null;
    }

    int countHE() {
        return (int) emplist.stream().filter(e -> e instanceof HourlyEmployee).count();
    }

    int countCE() {
        return (int) emplist.stream().filter(e -> e instanceof CommissionEmployee && !(e instanceof BasedPlusCommissionEmployee)).count();
    }

    int countBCPE() {
        return (int) emplist.stream().filter(e -> e instanceof BasedPlusCommissionEmployee).count();
    }

    int countPWE() {
        return (int) emplist.stream().filter(e -> e instanceof PieceWorkerEmployee).count();
    }

    void displayHE() {
        emplist.stream().filter(e -> e instanceof HourlyEmployee).forEach(System.out::println);
    }

    void displayCE() {
        emplist.stream().filter(e -> e instanceof CommissionEmployee).forEach(System.out::println);
    }

    void displayBCPE() {
        emplist.stream().filter(e -> e instanceof BasedPlusCommissionEmployee).forEach(System.out::println);
    }

    void displayPWE() {
        emplist.stream().filter(e -> e instanceof PieceWorkerEmployee).forEach(System.out::println);
    }
}
