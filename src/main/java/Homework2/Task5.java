package Homework2;

public class Task5 {

    public static void main(String[] args) {
        myMethod();                                  //създаваме метод, който да ни е началото на кода
    }
    static void myMethod () {
        int [] arr1 = {10, 12, 1, 8, 4,};             //създаваме първи масив от определен тип
        int [] arr2;                                //създаваме втори масив
        arr2 = arr1;                               //обосноваваме, че новият масив е еднакъв със първият
        int i;                                     // задаваме променлива
        System.out.println("The values of arr2: ");
        for (i=0; i<arr2.length; i++) {            //обхождаме масива и извличаме информация за бр. от зададените променливи и техните стойности  в конзолата

            System.out.println(arr2[i]);
        }
        System.out.print("The number of the variables in arr2 = " + i); //
    }
}
