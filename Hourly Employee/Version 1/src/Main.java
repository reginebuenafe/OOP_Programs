public class Main {
    public static void main(String[] args) {

        System.out.println("Hourly Employee");

        HourlyEmployee hourlyEmp = new HourlyEmployee(24.50F, 1500, "Regine Buenafe", 22100974);

        hourlyEmp.displayHourlyEmployee();
        System.out.println();

        System.out.println("Piece Worker Employee");

        PieceWorkerEmployee PWEmp = new PieceWorkerEmployee(22100974, "Regine Buenafe", 50, 400);

        PWEmp.displayHourlyEmployee();
        System.out.println();

        System.out.println("Commission Employee");

        CommissionEmployee commEmp = new CommissionEmployee(5000, "Regine Buenafe", 22100974);

        commEmp.displayCommission();
        System.out.println();


        System.out.println("Based + Commission Employee");

        BasedPlusCommissionEmployee BPCommEmp = new BasedPlusCommissionEmployee(654800, 67890, "Regine Buenafe", 22100974);

        BPCommEmp.displayBPCommission();
        System.out.println();
    }
}