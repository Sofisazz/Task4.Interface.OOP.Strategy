package students;

import interfaces.StudentStrategy;

public class Student {

     String firstName;
     String lastName;
     int age;
     double talent;
     int type;
     int javaTime;
     private StudentStrategy strategy;

     public Student(String firstName, String lastName, int age, double talent, int type) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.talent = talent;
          this.type = type;
          this.javaTime = 198;

          switch (this.type) {
               case 1 -> this.strategy = new FirstTypeStudent();
               case 2 -> this.strategy = new SecondTypeStudent();
               case 3 -> this.strategy = new ThirdTypeStudent();
               default -> {
                    System.out.println("Неверно указан тип");
                    return;
               }
          }
     }

     public  void executeStrategy() {
          strategy.getTime(type, talent, javaTime);
     }
}
