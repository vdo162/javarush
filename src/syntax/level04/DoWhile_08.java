/*
Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
*/

package syntax.level04;

import java.util.Scanner;

public class DoWhile_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int number = scanner.nextInt();

        do {
            System.out.println(str);
            number--;
        } while (number > 0 && number < 4);
    }
}