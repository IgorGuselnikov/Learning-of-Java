package lesson5;

public class Emloyee {
    Emloyee(int id2, String surname2, int age2, double salary2,  String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;


   double incraseSalary(double salary2){
         salary *= 2;
        return salary;
   }
}

class EmployeeTest{
    public static void main(String[] args) {
        Emloyee person1 = new Emloyee(0034, "Ivan", 33, 2048.56, "development");
        Emloyee person2 = new Emloyee(39, "Petr", 35, 6098.00, "development");

        System.out.println("Зарплата у " + person1.surname + " составляет: " + person1.incraseSalary(person1.salary));
        System.out.println("Зарплата у " + person2.surname + " составляет: " + person2.incraseSalary(person2.salary));
    }
}