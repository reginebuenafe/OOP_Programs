public abstract class Employee {
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

    public void displayEmployee() {
        System.out.println(this);
    }

    public abstract double computeSalary();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(getEmpID()).append("\n")
                .append("Employee Name: ").append(getEmpName()).append("\n");
        return sb.toString();
    }
}
