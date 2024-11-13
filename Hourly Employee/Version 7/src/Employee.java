public abstract class Employee implements IntEmployee {
    private int empID;
    private String empName;

    public Employee() {}

    public Employee(int empID) {
        this.empID = empID;
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public Employee(String empName, int empID) {
        this.empID = empID;
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public abstract double computeSalary();

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName;
    }
}
