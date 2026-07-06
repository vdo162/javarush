/*
Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:
Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
Вывести на экран результат деления первого числа на второе.
Результатом должно быть вещественное число.
*/

package syntax.level04;

import java.util.Scanner;

public class Double_09_ShareCoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cans = scanner.nextInt();
        int people = scanner.nextInt();
        System.out.println(1.0 * cans / people);
    }
}
