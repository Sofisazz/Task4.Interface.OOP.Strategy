package students;

import interfaces.StudentStrategy;

public class SecondTypeStudent implements StudentStrategy {

    @Override
    public void getTime(int type, double talent, int javaTime) {

        double timeTotal = javaTime * 2 / talent ;
        double timePractice = timeTotal / 2;

        System.out.println("Тип студента: " + type + "\tТалант: " + String.format("%.2f", talent));
        System.out.println("Время необходимое для разбора: " + String.format("%.2f", timePractice));
        System.out.println("Время необходимое для практики: " + String.format("%.2f", timePractice));
        System.out.println("Суммарное время на освоение навыка: " + String.format("%.2f", timeTotal));
        System.out.println();
    }
}
