/*
В этой задаче нужно:
Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.
*/

package syntax.level04;

import java.util.Scanner;

public class While_05_Min2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = min1;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < min1) {
                min2 = min1;
                min1 = number;
            } else if (number < min2) {
                min2 = number;
            }
        }
        System.out.println(min2);
    }
}