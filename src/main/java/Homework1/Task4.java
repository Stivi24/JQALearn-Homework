package Homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner see = new Scanner(System.in); //нов клас четец
        System.out.print("Enter the hours: "); //изваждане подканящи съобщения за променливи от рализчен тип в конзолата
        int workhours = see.nextInt();          //деклариране типа на променливата
        System.out.print("Enter the sum: ");
        float sum = see.nextFloat();
        System.out.print("For weekend is true or false: ");
        boolean weekend = see.nextBoolean();
        if (!weekend) {                   //с условни оператаори правим  проверка на логиката. boolean условие за дните.
            System.out.println("I will go for shoping ");
        } else {
            if (sum <= 0) { //с  вложени цикли на пронливи влизаме в "boolean" условие на логиката и извършваме финални проверки
                System.out.println("My time to be alone");   // в зависимосто то получените проверки изваждаме текст в конзолата
            }
            if (sum >= 10) {
                System.out.println("I will order fast food ");
            }
            if (sum > 0 && sum < 10) {
                System.out.println("Get some nice food  ");
            }
        }
    }
}