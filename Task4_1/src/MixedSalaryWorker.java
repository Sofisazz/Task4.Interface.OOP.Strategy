public class MixedSalaryWorker extends Worker {

    double bonus;

    MixedSalaryWorker(String firstName, String lastName, int age, String position, double monthlySalary, double bonus) {
        super(firstName, lastName, age, position, monthlySalary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Начисление почасовой зарплаты.\nДолжность: " + position + "\nБонус составляет: " + bonus + " бел. р.");

        double salary = monthlySalary + bonus;
        double retention = salary * 0.13;

        balance += salary - retention;

        String enrolled = String.format("%.2f", (salary - retention));

        System.out.println("Начислено: " + enrolled + " бел. р.");
    }
}
