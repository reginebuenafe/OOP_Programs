public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {}

    public PieceWorkerEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public PieceWorkerEmployee(String empName, int empID) {
        super(empName, empID);
    }

    public PieceWorkerEmployee(double ratePerPiece, int totalPiecesFinished) {
        this.ratePerPiece = ratePerPiece;
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, double ratePerPiece) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public void setFinishedPieces (int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public int getFinishedPieces () {
        return this.totalPiecesFinished;
    }

    public void setRate (double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double getRate() {
        return this.ratePerPiece;
    }

    public double computeSalary() {
        return totalPiecesFinished * ratePerPiece + ((int) totalPiecesFinished / 100) * (10 * ratePerPiece);
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
        sb.append("Total hours worked: ").append(getFinishedPieces()).append("\n");
        sb.append("Rate per hour: ").append(getRate()).append("\n");
        return sb.toString();
    }
}