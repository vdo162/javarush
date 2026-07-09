/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ. Выведи на экран максимальное четное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
Если среди введенных символов нет четного числа или введен только один не числовой символ, то вывести на экран минимальное значение числа типа int.
*/

package syntax.level04;

import java.util.Scanner;

public class While_05_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0 && number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}