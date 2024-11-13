public class Main {
    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster();

        // Creating employee instances and adding them to the roster
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

        System.out.println("Employees: ");
        roster.displayAllEmp();
    }
}
