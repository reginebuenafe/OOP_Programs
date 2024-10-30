public class CommissionEmployee {
    private double totalSales;
    private String empName;
    private int empID;

    public CommissionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double computeSalary(){
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

    public void displayCommission() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID +
                "\nEmployee Name: " + empName +
                "\nTotal Sales: " + totalSales +
                "\n\nCommission: $" + computeSalary();
    }
}
