import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        HourlySalaryWorker Bob = new HourlySalaryWorker("Боб", "Люких", 25, "Слесарь", 1500, 160, 0);
        Bob.getBalance();

        Scanner in = new Scanner(System.in);
        boolean accrue = false;

        do {
            System.out.print("Введите количество отработанных часов: ");
            int numberOfHours = in.nextInt();

            if (numberOfHours < 0) {
                System.out.println("Введите количество часов!");
                return;
            }

            Bob.setNumberOfHours(numberOfHours);
            Bob.calculateSalary();
            Bob.getBalance();

            boolean go = false;
            int choice;
            do {
                System.out.print("Продолжить начисление зарплаты работника \"" + Bob.firstName + "\"?\n1. Да\n2. Нет\nОтвет: ");
                choice = in.nextInt();

                if (choice < 1 || choice > 2) {
                    System.out.println("\nВведите верный выбор ответа!");
                    go = true;
                } else {
                    go = false;
                }
            } while (go);

            accrue = choice == 1;

        } while (accrue);

        PercentageSalaryWorker Mary = new PercentageSalaryWorker("Мэри", "Нилли", 41, "Менеджер", 1700, 0);
        Mary.getBalance();

        do {
            System.out.print("Введите процент от оклада: ");
            int percent = in.nextInt();

            if (percent < 0) {
                System.out.println("Введите верное число процента!");
                return;
            }

            Mary.setPercent(percent);
            Mary.calculateSalary();
            Mary.getBalance();

            boolean go = false;
            int choice;
            do {
                System.out.print("Продолжить начисление зарплаты работника \"" + Mary.firstName + "\"?\n1. Да\n2. Нет\nОтвет: ");
                choice = in.nextInt();

                if (choice < 1 || choice > 2) {
                    System.out.println("\nВведите верный выбор ответа!");
                    go = true;
                } else {
                    go = false;
                }
            } while (go);

            accrue = choice == 1;

        } while (accrue);

        MixedSalaryWorker Duk = new MixedSalaryWorker("Дюк", "Миллер", 32, "Инженер", 2100, 0);
        Duk.getBalance();

        do {
            System.out.print("Введите сумму премии (бонуса): ");
            int bonus = in.nextInt();

            if (bonus < 0) {
                System.out.println("Введите верную сумму премии (бонуса)!");
                return;
            }

            Duk.setBonus(bonus);
            Duk.calculateSalary();
            Duk.getBalance();

            boolean go = false;
            int choice;
            do {
                System.out.print("Продолжить начисление зарплаты работника \"" + Duk.firstName + "\"?\n1. Да\n2. Нет\nОтвет: ");
                choice = in.nextInt();

                if (choice < 1 || choice > 2) {
                    System.out.println("\nВведите верный выбор ответа!");
                    go = true;
                } else {
                    go = false;
                }
            } while (go);

            accrue = choice == 1;

        } while (accrue);

        in.close();
    }
}
