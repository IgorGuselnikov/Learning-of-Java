package lesson7;

public class Emloyee {
    public Emloyee(int id2, String surname2, int age2, double salary2,  String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
    private Emloyee(int id2, String surname2){
        id = id2;
        surname = surname2;
    }
    protected Emloyee(int age2, double salary2,  String department2){
        age = age2;
        salary = salary2;
        department = department2;
    }
    protected int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void first(){
        System.out.println(salary);
    }
    public void second(){
        System.out.println(surname);
    }
    public void third(){
        System.out.println(id);
    }

    double incraseSalary(double salary2){
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Emloyee person1 = new Emloyee(0034, "Ivan", 33, 2048.56, "development");
        Emloyee person2 = new Emloyee(34, 4500, "IT");

        System.out.println("Зарплата у " + person1.surname + " составляет: ");
        person1.first();
        System.out.println("Зарплата у " + person2.surname + " составляет: ");
        person1.third();
    }
}

class Development{
    public static void main(String[] args) {
        Emloyee person3 = new Emloyee(235, "Petrov");
    }
}