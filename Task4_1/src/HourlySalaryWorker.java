public class HourlySalaryWorker extends Worker {

    int monthlyRateHours;
    int numberOfHours;

    HourlySalaryWorker(String firstName, String lastName, int age, String position, double monthlySalary, int monthlyRateHours, int numberOfHours) {
        super(firstName, lastName, age, position, monthlySalary);
        this.monthlyRateHours =  monthlyRateHours;
        this.numberOfHours = numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Начисление почасовой зарплаты.\nДолжность: " + position + "\nКоличество отработанных часов за месяц: " + numberOfHours + " часов");

        double salary = (monthlySalary / monthlyRateHours) * numberOfHours;
        double retention = salary * 0.13;

        balance += salary - retention;

        String enrolled = String.format("%.2f", (salary - retention));

        System.out.println("Начислено: " + enrolled + " бел. р.");
    }
}

