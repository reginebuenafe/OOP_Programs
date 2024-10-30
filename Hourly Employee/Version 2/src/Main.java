public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(20101102, "Eduardo Cortes");
        Employee emp3 = new Employee("Christian Buenafe", 22100974);
        Employee emp4 = new Employee(12345678);
        Employee emp5 = new Employee("Regine Lequit");
        emp1.setEmpID(22100974);
        emp1.setEmpName("Regine Buenafe");
        emp4.setEmpName("Miguel Cortes");
        emp5.setEmpID(87654321);

        emp1.displayEmployee();
        System.out.println();
        emp2.displayEmployee();
        System.out.println();
        emp3.displayEmployee();
        System.out.println();
        emp4.displayEmployee();
        System.out.println();
        emp5.displayEmployee();
        System.out.println();

        HourlyEmployee he1 = new HourlyEmployee(1, "Regine Buenafe", 100, 900.0);
        HourlyEmployee he2 = new HourlyEmployee("Eduardo Cortes", 150);
        HourlyEmployee he3 = new HourlyEmployee(200, 1500.0);
        HourlyEmployee he4 = new HourlyEmployee(4, "Miguel Cortes");
        HourlyEmployee he5 = new HourlyEmployee();

        he2.setRatePerHour(2500.0);
        he2.setEmpID(2);

        he3.setEmpName("Christian Buenafe");
        he3.setEmpID(3);

        he4.setTotalHoursWorked(120);
        he4.setRatePerHour(699.0);

        he5.setEmpID(5);
        he5.setEmpName("Regine Lequit");
        he5.setTotalHoursWorked(74);
        he5.setRatePerHour(1798.0);

        he1.displayHourlyEmployee();
        System.out.println();
        he2.displayHourlyEmployee();
        System.out.println();
        he3.displayHourlyEmployee();
        System.out.println();
        he4.displayHourlyEmployee();
        System.out.println();
        he5.displayHourlyEmployee();
        System.out.println();

        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(1, "Regine Buenafe", 100, 10.0);
        PieceWorkerEmployee pwe2 = new PieceWorkerEmployee("Eduardo Cortes", 2);
        PieceWorkerEmployee pwe3 = new PieceWorkerEmployee(5.0, 200);
        PieceWorkerEmployee pwe4 = new PieceWorkerEmployee(4, "Miguel Cortes");
        PieceWorkerEmployee pwe5 = new PieceWorkerEmployee();

        pwe2.setFinishedPieces(1000);
        pwe2.setRate(0.5);

        pwe3.setEmpID(3);
        pwe3.setEmpName("Christian Buenafe");

        pwe4.setFinishedPieces(500);
        pwe4.setRate(1.0);

        pwe5.setEmpID(5);
        pwe5.setEmpName("Regine Lequit");
        pwe5.setFinishedPieces(2000);
        pwe5.setRate(0.75);

        pwe1.displayHourlyEmployee();
        System.out.println();
        pwe2.displayHourlyEmployee();
        System.out.println();
        pwe3.displayHourlyEmployee();
        System.out.println();
        pwe4.displayHourlyEmployee();
        System.out.println();
        pwe5.displayHourlyEmployee();
        System.out.println();

        CommissionEmployee ce1 = new CommissionEmployee(1, "Regine Buenafe", 10000);
        CommissionEmployee ce2 = new CommissionEmployee("Eduardo Cortes");
        CommissionEmployee ce3 = new CommissionEmployee(3);
        CommissionEmployee ce4 = new CommissionEmployee(4, "Miguel Cortes");
        CommissionEmployee ce5 = new CommissionEmployee();

        ce2.setEmpID(2);
        ce2.setTotalSales(100000);

        ce3.setEmpName("Christian Buenafe");
        ce3.setTotalSales(1000000);

        ce4.setTotalSales(10000000);

        ce5.setEmpID(5);
        ce5.setEmpName("Regine Lequit");
        ce5.setTotalSales(100000000);

        ce1.displayHourlyEmployee();
        System.out.println();
        ce2.displayHourlyEmployee();
        System.out.println();
        ce3.displayHourlyEmployee();
        System.out.println();
        ce4.displayHourlyEmployee();
        System.out.println();
        ce5.displayHourlyEmployee();
        System.out.println();

        BasedPlusCommissionEmployee bpce1 = new BasedPlusCommissionEmployee(1, "Regine Buenafe", 100000, 1000);
        BasedPlusCommissionEmployee bpce2 = new BasedPlusCommissionEmployee(2, "Eduardo Cortes");
        BasedPlusCommissionEmployee bpce3 = new BasedPlusCommissionEmployee("Christian Buenafe", 3, 10000, 1000);
        BasedPlusCommissionEmployee bpce4 = new BasedPlusCommissionEmployee(1000000, 1000);
        BasedPlusCommissionEmployee bpce5 = new BasedPlusCommissionEmployee();

        bpce2.setTotalSales(1000);
        bpce2.setBaseSalary(1000);

        bpce4.setEmpID(4);
        bpce4.setEmpName("Miguel Cortes ");

        bpce5.setEmpID(5);
        bpce5.setEmpName("Regine Lequit");
        bpce5.setTotalSales(100000);
        bpce5.setBaseSalary(1000);

        bpce1.displayHourlyEmployee();
        System.out.println();
        bpce2.displayHourlyEmployee();
        System.out.println();
        bpce3.displayHourlyEmployee();
        System.out.println();
        bpce4.displayHourlyEmployee();
        System.out.println();
        bpce5.displayHourlyEmployee();
        System.out.println();
    }
}