public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    //constructor
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
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

    public double computeSalary() {
        double salary = (double) this.totalHoursWorked * this.ratePerHour;

        if(this.totalHoursWorked > 40){
            salary *= 1.50;
        }
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID +
                "\nEmployee Name: " + empName +
                "\nTotal Hours Worked: " + totalHoursWorked +
                "\nRate per Hour: $" + ratePerHour +
                "\n\nSalary: $" + computeSalary();
    }


}
