package lesson5;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta (double balance){
        double result = 0;
        result += balance;
        return result;
    }

    double snyatieSoScheta (double balance){
        double result = 0;
        result -= balance;
        return result;
    }
}
