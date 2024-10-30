public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {}

    public CommissionEmployee(int empID) {
        super(empID);
    }

    public CommissionEmployee(String empName) {
        super(empName);
    }

    public CommissionEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public CommissionEmployee(int empID, String empName, double totalSales) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double computeSalary() {
        double salary;
        if (totalSales < 10000) {
            salary = totalSales * 0.05;
        } else if (totalSales < 100000 && totalSales >= 10000) {
            salary = totalSales * 0.1;
        } else if (totalSales < 1000000) {
            salary = totalSales * 0.2;
        } else {
            salary = totalSales * 0.3;
        }
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(getEmpID()).append("\n");
        sb.append("Employee name: ").append(getEmpName()).append("\n");
        sb.append("Total sales: ").append(getTotalSales()).append("\n");
        return sb.toString();
    }
}