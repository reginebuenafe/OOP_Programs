public class BasedPlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public BasedPlusCommissionEmployee(String empName, int empID, double baseSalary, double totalSales) {
        super(empID, empName);
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, String empName, double totalSales, double baseSalary) {
        super(empID, empName, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

    public void displayBasedPlusCommissionEmployee() {
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("Employee ID: ").append(getEmpID()).append("\n")
                .append("Employee Name: ").append(getEmpName()).append("\n")
                .append("Base Salary: ").append(getBaseSalary()).append("\n")
                .append("Total Sales: ").append(getTotalSales()).append("\n");
        return sb.toString();
    }
}
