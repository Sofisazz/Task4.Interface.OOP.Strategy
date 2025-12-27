import interfaces.Salariable;

public abstract class Worker extends Person implements Salariable {

    String position;
    double monthlySalary;
    double balance;

    Worker(String firstName, String lastName, int age, String position, double monthlySalary) {
        super(firstName, lastName, age);
        this.position = position;
        this.balance = 0;
        this.monthlySalary = monthlySalary;
    }

    public void getBalance() {
        String balanceOut = String.format("%.2f", balance);

        System.out.println("\nБаланс работника \"" + firstName + "\" составляет: " + balanceOut + " бел. р.\n");
    }

}
