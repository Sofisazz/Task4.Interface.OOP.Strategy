public class PercentageSalaryWorker extends Worker {

    double percent;

    PercentageSalaryWorker (String firstName, String lastName, int age, String position, double monthlySalary, double percent)  {
        super(firstName, lastName, age, position, monthlySalary);
        this.percent = percent;
    }

    public void setPercent(double percent){
        this.percent = percent;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Начисление почасовой зарплаты.\nДолжность: " + position + "\nПроцент составляет: " + percent + "%");

        double salary =  monthlySalary + monthlySalary * (percent / 100);
        double retention = salary * 0.13;

        balance += salary - retention;

        String enrolled = String.format("%.2f", (salary - retention));

        System.out.println("Начислено: " + enrolled + " бел. р.");
    }

}

