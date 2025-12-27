package students;

import interfaces.StudentStrategy;

public class ThirdTypeStudent implements StudentStrategy {

    @Override
    public void getTime(int type, double talent, int javaTime) {

        double timeTotal = javaTime * 3 / talent;

        System.out.println("Тип студента: " + type + "\tТалант: " + String.format("%.2f", talent));
        System.out.println("Время необходимое для практики: " + String.format("%.2f", timeTotal));
        System.out.println("Суммарное время на освоение навыка: " + String.format("%.2f", timeTotal));
        System.out.println();
    }
}
