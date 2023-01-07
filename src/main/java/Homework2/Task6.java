package Homework2;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        int[] first = {1, 2, 3};                               //инициализираме масивите
        int[] second = {1, 2, 3};
        if (Arrays.equals(first, second)) {                     //Сравняваме, стойностите с услове за еднаквост
            System.out.println("Same array");                  //Извеждаме резултата от сравнението в кознолата
        }
        else {
            System.out.println("Different array");            // Поставяме условие при наличие на  Грешка в резултат на сравнението
        }

    }
}
