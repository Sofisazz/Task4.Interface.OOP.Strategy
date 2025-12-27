package students;

import interfaces.StudentStrategy;

public class FirstTypeStudent implements StudentStrategy {

    @Override
    public void getTime(int type, double talent, int javaTime) {

        double timeTotal = javaTime / talent;
        double timePractice = timeTotal / 3;

        System.out.println("Тип студента: " + type + "\tТалант: " + String.format("%.2f", talent));
        System.out.println("Время необходимое для разбора: " + String.format("%.2f", timePractice));
        System.out.println("Время необходимое для практики: " + String.format("%.2f", timePractice));
        System.out.println("Время необходимое для нахождения в потоке: " + String.format("%.2f", timePractice));
        System.out.println("Суммарное время на освоение навыка: " + String.format("%.2f", timeTotal));
        System.out.println();
    }
}
