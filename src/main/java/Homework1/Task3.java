package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] Args) {
        Scanner see = new Scanner(System.in);     //създаване на нов четец, в началото на системата
        System.out.print("Enter the X value: "); // съобщение за въвеждането на стойност
        int x = see.nextInt();                  // задаване типа на променливи
        System.out.print("Enter the Y value: ");
        int y = see.nextInt();
        System.out.print("Enter the Z value: ");
        int z = see.nextInt();
        z = x + y + z;                        //Завъртане стойностите, чрез матетаматически действия
        y = z - (x + y); //3
        x = z - (x + y); //2
        z = z - (x + y); //1
        System.out.println("The new X value is: " + x);    // Изваждане на стойностите в конзолата
        System.out.println("The new Y value is: " + y);
        System.out.println("The new Z value is: " + z);
        System.out.print("The difference is: " + ((x + y) - z)); // изваждане на  разликата между сбора и едната променлива в конзолата
    }
}
