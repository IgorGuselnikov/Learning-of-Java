package lesson6;

public class Task1 {
    int summary(){
        int result = 0;
        System.out.println(result);
        return result;
    }
    int summary(int a){
        int result = 0;
        result += a;
        System.out.println(result);
        return result;
    }
    int summary(int a, int b){
        int result = 0;
        result = a + b;
        System.out.println(result);
        return result;
    }
    int summary(int a, int b, int c){
        int result = 0;
        result = a + b + c;
        System.out.println(result);
        return result;
    }
    int summary(int a, int b, int c, int d){
        int result = 0;
        result = a + b + c + d;
        System.out.println(result);
        return result;
    }
}

class Test{
    public static void main(String[] args) {
        Task1 test = new Task1();
        test.summary();
        test.summary(2);
        test.summary(2,45);
        test.summary(2,5,34);
        test.summary(3,4,89,45);
    }
}