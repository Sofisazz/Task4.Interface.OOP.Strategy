import students.Student;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        for (int i = 1; i <= 3; i++) {
            Student Student1 = new Student("Студент_" + i , "Силл", new Random().nextInt(9) + 17, new Random().nextDouble() * 0.9 + 0.1, i);
            Student Student2 = new Student("Студентка_" + i , "Килдон", new Random().nextInt(9) + 17, new Random().nextDouble() * 0.9 + 0.1, i);
            Student Student3 = new Student("Студент_" + i , "Мрек", new Random().nextInt(9) + 17, new Random().nextDouble() * 0.9 + 0.1, i);

            System.out.println("Студенты " + i + "-го типа:");
            Student1.executeStrategy();
            Student2.executeStrategy();
            Student3.executeStrategy();
        }
    }
}