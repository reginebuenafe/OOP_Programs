import java.util.ArrayList;

public class EmployeeRoster {
    private ArrayList<Employee> emplist = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return emplist.add(e);
    }

    public Employee removeEmployee(int id) {
        for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i).getEmpID() == id) {
                return emplist.remove(i);
            }
        }
        return null; // No employee found with the given ID
    }

    public int countHE() {
        int heCount = 0;
        for (Employee e : emplist) {
            if (e instanceof HourlyEmployee) heCount++;
        }
        return heCount;
    }

    public int countCE() {
        int ceCount = 0;
        for (Employee e : emplist) {
            if (e instanceof CommissionEmployee && !(e instanceof BasedPlusCommissionEmployee)) {
                ceCount++;
            }
        }
        return ceCount;
    }

    public int countBCPE() {
        int bcpeCount = 0;
        for (Employee e : emplist) {
            if (e instanceof BasedPlusCommissionEmployee) bcpeCount++;
        }
        return bcpeCount;
    }

    public int countPWE() {
        int pweCount = 0;
        for (Employee e : emplist) {
            if (e instanceof PieceWorkerEmployee) pweCount++;
        }
        return pweCount;
    }

    public void displayHE() {
        for (Employee e : emplist) {
            if (e instanceof HourlyEmployee) {
                System.out.println(e);
            }
        }
    }

    public void displayCE() {
        for (Employee e : emplist) {
            if (e instanceof CommissionEmployee && !(e instanceof BasedPlusCommissionEmployee)) {
                System.out.println(e);
            }
        }
    }

    public void displayBCPE() {
        for (Employee e : emplist) {
            if (e instanceof BasedPlusCommissionEmployee) {
                System.out.println(e);
            }
        }
    }

    public void displayPWE() {
        for (Employee e : emplist) {
            if (e instanceof PieceWorkerEmployee) {
                System.out.println(e);
            }
        }
    }
}
