public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Regine Buenafe", 123456789, 10000, 10000);
        Account account2 = new Account("Christian Buenafe", 987654321, 50000, 50000);

        account1.display();
        System.out.println();
        account2.display();

        account1.deposit(2500);
        account2.transfer(5000, account1);

        System.out.println();
        account1.display();
        System.out.println();
        account2.display();
        System.out.println();


        account1.transfer(17800, account2);
        System.out.println();


        account1.display();
        System.out.println();
        account2.display();
    }
}