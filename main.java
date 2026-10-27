import transaction.Account;
import report.Transactionreport;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(12345, 5000);

        acc.deposit(2000);
        acc.withdraw(1000);

        Transactionreport report = new Transactionreport();
        report.generateReport(acc);
    }
}