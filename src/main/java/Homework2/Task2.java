package Homework2;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(myMethod());       // метод с който да стартираме и чрез който изпълняваме фунцията на друг метод
    }
    static int myMethod() {                  //метод който връща резултат в конзолата
        int a = 152;
        int b = 48;
        return (a + b)/2;                   // резулта от сбора на променливите
    }
}
