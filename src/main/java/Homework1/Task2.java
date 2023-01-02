package Homework1;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] Args) {
        Scanner see = new Scanner(System.in);    // нов четец във входа на системата
        System.out.print("Enter the value1: "); // Изизскване за въвеждане на число
        int vl1 = see.nextInt();              // Променлива стойност, която въвеждаме от клавиатурата
        System.out.print("Enter the value2: ");
        int vl2 = see.nextInt();
        System.out.print("Enter the value3: ");
        double vl3 = see.nextDouble();
        System.out.print("Enter the value4: ");
        double vl4 = see.nextDouble();
        System.out.println("before swap value1: " + vl1); // Изваждане на текст и стойности
        System.out.println("before swap value2: " + vl2);
        System.out.println("before swap value3: " + vl3);
        System.out.println("before swap value4: " + vl4);
        int a1 = vl1 + vl2; // сумиране на променливите от тип (" INT " )
        double a2 = vl3 + vl4;// същото сумиране на променливите от тип ( "DOUBLE")
        System.out.println("The sum of val1/val2 is: " + a1); // изваждане на резултата от сумирането на променливте в конзолата
        System.out.println("The sum of val3/val4 is: " + a2);
        int temp = vl1;                                 //  променлива която да приеме стойноста от друга (съществуваща) вече променлива
        vl1 = (int) vl3;                                // Размяна на стойностите по типа им
        vl3 = temp;
        double temp2 = vl4;
        vl4 = vl2;
        vl2 = (int) temp2;
        System.out.println("after swap value1: " + vl1);
        System.out.println("after swap value2: " + vl2);        // Извеждане в конзолата стойностите след размяната
        System.out.println("after swap value3: " + vl3);
        System.out.println("after swap value4: " + vl4);
        int а3 = vl1 + vl2;                                  //сумиране на стойностите след размяната
        double a4 = vl3 + vl4;
        System.out.println("The sum after swap is: " + а3);  //извиквам на екран сумата след промяната
        System.out.println("The sum after swap is: " + a4);

    }
}