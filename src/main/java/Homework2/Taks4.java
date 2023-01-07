package Homework2;

import java.util.stream.IntStream;


public class Taks4 {

    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 11).toArray();       //създаване на масив с поредни стойности
        int i = 0;                                          //за While цикъла инициализираме индекс, който да е  начало на масива
        while (i < arr.length) {                            //Поставяме условие за нашият цикъл
            System.out.println(arr[i]);                     //Извеждаме стойностие в конзолата
            i++;                                            //инкрементираме  с единица
        }
        for (i = 0; i < arr.length; i++) {                  //здаваме  условие за нашият масив
            System.out.println(arr[i]);                    //Извеждаме стойностие в конзолата
        }
    }
}

