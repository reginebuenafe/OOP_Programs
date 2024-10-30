public class PieceWorkerEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
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
        double salary = 0.00;
        if(this.totalPiecesFinished % 100 == 0){
            this.ratePerPiece *= 10;
        }

        return salary = (double) this.totalPiecesFinished * this.ratePerPiece;

    }

    public void displayHourlyEmployee() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Employee ID: " + empID +
                "\nEmployee Name: " + empName +
                "\nTotal Pieces Finished: " + totalPiecesFinished +
                "\nRate per Piece: $" + ratePerPiece +
                "\n\nSalary: $" + computeSalary();
    }
}
