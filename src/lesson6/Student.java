package lesson6;

public class Student {
       Student(int id2, String firstname2, String lastname2, int years_of_study2, double avarenge_value_math2, double avarenge_value_economic2, double averenge_value_forign_language2){
            number_id = id2;
            firstname = firstname2;
            lastname = lastname2;
            years_of_study = years_of_study2;
            avarenge_value_math = avarenge_value_math2;
            avarenge_value_economic = avarenge_value_economic2;
            averenge_value_forign_language = averenge_value_forign_language2;
       }
        Student(int id3, String name3, String lastname3, int years_of_study3){
           this (id3, name3, lastname3, years_of_study3, 0.00, 0.00, 0.00);
    }
        Student() {
            this(0, null, null, 0, 0.00, 0.00, 0.00);
        }
        int number_id;
        String firstname;
        String lastname;
        int years_of_study;
        double avarenge_value_math;
        double avarenge_value_economic;
        double averenge_value_forign_language;
    }
    class StudentTest{
        public static void main(String[] args) {
            Student person1 = new Student(23, "Ivan", "Petrov", 2021, 9.5, 9.7, 6.8);
            Student person2 = new Student(34, "Valera", "Zolotov",2020);
            Student person3 = new Student();

            System.out.println("Средняя арифметическая оценка " + person1.firstname + " " + person1.lastname + " имеет значение равное = " + ((person1.avarenge_value_math + person1.avarenge_value_economic + person1.averenge_value_forign_language)/3));
            System.out.println("Средняя арифметическая оценка " + person2.firstname + " " + person2.lastname + " имеет значение равное = " + (person2.avarenge_value_math + person2.avarenge_value_economic + person2.averenge_value_forign_language)/3);
            System.out.println("Средняя арифметическая оценка " + person3.firstname + " " + person3.lastname + " имеет значение равное = " + (person3.avarenge_value_math + person3.avarenge_value_economic + person3.averenge_value_forign_language)/3);
        }
    }

