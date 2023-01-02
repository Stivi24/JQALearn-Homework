package Homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] Args) {

    Scanner see = new Scanner(System.in);
    System.out.print("Enter the number from 1 to 7 : ");     // текст който да поясни опрелена задача която да се извърши
    int day = see.nextInt(); //стойност на променливата която, ще въведем

    switch (day) {          // Проверка при определните вече условия
        case 1:
            System.out.print("Monday");
            break;                     // Команда с която ще прекратим изпълнението скрипта, при вярно изпълнено условие
        case 2:
            System.out.print("Tuesday");
            break;
        case 3:
            System.out.print("Wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5:
            System.out.print("Friday");
            break;
        case 6:
            System.out.print("Saturday");
            break;
        case 7:
            System.out.print("Sunday");
            break;
        default:        //при стойност различна от очакваната системата трябва да изпише ( "Error" )

            System.out.print("Error");

    }
 }
}
