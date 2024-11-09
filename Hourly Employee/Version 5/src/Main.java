public class Main {
    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster();

        Employee emp1 = new HourlyEmployee(1, "Regine Buenafe", 20, 40);
        Employee emp2 = new CommissionEmployee(2, "Eduardo Cortes", 9000);
        Employee emp3 = new BasedPlusCommissionEmployee("Christian Buenafe", 3, 1500.0F, 100);
        Employee emp4 = new PieceWorkerEmployee(4, "Miguel Cortes", 15, 100);
        Employee emp5 = new PieceWorkerEmployee(5, "Edel Mellina", 15, 100);

        roster.addEmployee(emp1);
        roster.addEmployee(emp2);
        roster.addEmployee(emp3);
        roster.addEmployee(emp4);
        roster.addEmployee(emp5);

        System.out.println("Number of Hourly Employees: " + roster.countHE());
        System.out.println("Number of Commission Employees: " + roster.countCE());
        System.out.println("Number of Based Plus Commission Employees: " + roster.countBCPE());
        System.out.println("Number of Piece Worker Employees: " + roster.countPWE());

        System.out.println("\nHourly Employees:");
        roster.displayHE();

        System.out.println("\nCommission Employees:");
        roster.displayCE();

        System.out.println("\nBased Plus Commission Employees:");
        roster.displayBCPE();

        System.out.println("\nPiece Worker Employees:");
        roster.displayPWE();

        int idToRemove = 3;
        Employee removedEmployee = roster.removeEmployee(idToRemove);
        if (removedEmployee != null) {
            System.out.println("\nRemoved employee with ID " + idToRemove + ":\n" + removedEmployee);
        } else {
            System.out.println("\nEmployee with ID " + idToRemove + " not found.");
        }

        System.out.println("\nUpdated Roster:");
        roster.displayHE();
        roster.displayCE();
        roster.displayBCPE();
        roster.displayPWE();
    }
}
