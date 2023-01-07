package Homework2;

public class Task3 {

    public static void main(String[] args) {
        double [] arr = new double[5];       // декларираме масива от типа който искаме

        arr [0] = 10.1;                       //инициализираме масива от зададеният ни тип
        arr [1] = 11.2;
        arr [2] = 12.3;
        arr [3] = 13.4;
        arr [4] = 14.5;
        int i;                             //задаваме променлива, която да запази броя на променливите в масива

        for (i = 0; i < arr.length; i++)   // задаваме елементите в масива, които искаме да обходим

            System.out.println(arr[i]);    //извеждаме стойностите в конзолата
    }
}
