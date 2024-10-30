public class EmployeeRoster extends Employee {
    private Employee[] emplist = new Employee[5];
    private int count = 0;
    private int max = 5;

    boolean addEmployee(Employee e) {
        if (count < max) {
            emplist[count++] = e;
            return true;
        }
        return false;
    }

    Employee removeEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (emplist[i].getEmpID() == id) {
                Employee removedEmployee = emplist[i];
                for (int j = i; j < count - 1; j++) {
                    emplist[j] = emplist[j + 1];
                }
                emplist[--count] = null;
                return removedEmployee;
            }
        }
        return null;
    }

    int countHE() {
        int heCount = 0;
        for (Employee e : emplist) {
            if (e instanceof HourlyEmployee) heCount++;
        }
        return heCount;
    }

    int countCE() {
        int ceCount = 0;
        for (Employee e : emplist) {
            if (e instanceof CommissionEmployee) ceCount++;
        }
        return ceCount;
    }

    int countBCPE() {
        int bcpeCount = 0;
        for (Employee e : emplist) {
            if (e instanceof BasedPlusCommissionEmployee) bcpeCount++;
        }
        return bcpeCount;
    }

    int countPWE() {
        int pweCount = 0;
        for (Employee e : emplist) {
            if (e instanceof PieceWorkerEmployee) pweCount++;
        }
        return pweCount;
    }

    void displayHE() {
        for (Employee e : emplist) {
            if (e instanceof HourlyEmployee) {
                System.out.println(e);
            }
        }
    }

    void displayCE() {
        for (Employee e : emplist) {
            if (e instanceof CommissionEmployee) {
                System.out.println(e);
            }
        }
    }

    void displayBCPE() {
        for (Employee e : emplist) {
            if (e instanceof BasedPlusCommissionEmployee) {
                System.out.println(e);
            }
        }
    }

    void displayPWE() {
        for (Employee e : emplist) {
            if (e instanceof PieceWorkerEmployee) {
                System.out.println(e);
            }
        }
    }
}
