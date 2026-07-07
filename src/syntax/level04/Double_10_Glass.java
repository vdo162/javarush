/*
В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан. Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner. В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.
*/

package syntax.level04;

import java.util.Scanner;

public class Double_10_Glass {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean flag = scanner.nextBoolean();
        glass = flag ? Math.ceil(glass) : Math.floor(glass);
        System.out.println((int) glass);
    }
}
