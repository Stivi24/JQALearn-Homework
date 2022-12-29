import java.util.Scanner; // избираме четеца от таблицата


public class Homerwork1 {
    public static void main(String[] args) {
        Scanner see = new Scanner(System.in);       // създаваме нов четец в началото  на нашата система
        System.out.println("Enter your number");   //  Команда за изписване на текст или число
        int H1 = see.nextInt();                   //  Задаваме променливата която искаме да приемем от клавиатурата
        System.out.println("Enter your number");
        int H2 = see.nextInt();
        System.out.println("Enter your number");
        int H3 = see.nextInt();
        System.out.println("Enter you number");
        if (H1 > H2 && H2 < H3) // Изпълнява зададеното условие
        {

            System.out.println("Bravo six"); // При True

        } else {
            System.out.println("We going dark"); // При Faulse


        }
    }
}

