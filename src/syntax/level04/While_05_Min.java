/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ. Выведи на экран минимальное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
Если введен только один нечисловой символ, то вывести на экран максимальное значение числа типа int.
*/

package syntax.level04;

import java.util.Scanner;

public class While_05_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}