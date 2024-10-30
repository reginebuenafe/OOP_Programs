public class BasedPlusCommissionEmployee {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empId;

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empId) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empId = empId;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double computeSalary() {
        double rate = 0.00;

        if(this.totalSales < 10000){
            rate = 0.05;
        }else if(this.totalSales < 100000){
            rate = 0.10;
        }else if(this.totalSales < 1000000){
            rate = 0.20;
        }else if(this.totalSales >= 1000000){
            rate = 0.30;
        }

        return rate * totalSales;
    }

    public void displayBPCommission() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId +
                "\nEmployee Name: " + empName +
                "\nTotal Sales: " + totalSales +
                "\nBase Salary: $" + baseSalary +
                "\n\nSalary: $" + computeSalary();
    }
}
