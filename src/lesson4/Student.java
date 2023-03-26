package lesson4;

import java.sql.SQLOutput;

public class Student {
    int number_id;
    String firstname;
    String lastname;
    int years_of_study;
    double averenge_value_math;
    double averenge_value_economic;
    double averenge_value_forign_language;

    void averenge_grade(double a, double b, double c){
        double result = (a + b + c)/3;
        System.out.println(result);
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student person1 = new Student();
        Student person2 = new Student();
        Student person3 = new Student();

        person1.number_id = 001;
        person1.firstname = "Igor";
        person1.lastname = "Guselnikov";
        person1.years_of_study = 2005;
        person1.averenge_value_math = 4.6;
        person1.averenge_value_economic = 4.72;
        person1.averenge_value_forign_language = 4.16;

        person2.number_id = 002;
        person2.firstname = "Egor";
        person2.lastname = "Shelpakov";
        person2.years_of_study = 2005;
        person2.averenge_value_math = 4.11;
        person2.averenge_value_economic = 3.89;
        person2.averenge_value_forign_language = 4.97;

        person3.number_id = 002;
        person3.firstname = "Tatyana";
        person3.lastname = "Chertanova";
        person3.years_of_study = 2001;
        person3.averenge_value_math = 4.08;
        person3.averenge_value_economic = 4.92;
        person3.averenge_value_forign_language = 4.99;

        System.out.print("Среднюю арифметическую оценку " + person1.firstname + " " + person1.lastname + " имеет значение равное = ");
        person1.averenge_grade(person1.averenge_value_math, person1.averenge_value_economic, person1.averenge_value_forign_language);
        System.out.print("Среднюю арифметическую оценку " + person2.firstname + " " + person2.lastname + " имеет значение равное = ");
        person2.averenge_grade(person2.averenge_value_math, person2.averenge_value_economic, person2.averenge_value_forign_language);
        System.out.print("Среднюю арифметическую оценку " + person3.firstname + " " + person3.lastname + " имеет значение равное = ");
        person3.averenge_grade(person3.averenge_value_math, person3.averenge_value_economic, person3.averenge_value_forign_language);
    }
}