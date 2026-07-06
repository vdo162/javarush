/*
Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
В качестве значения pi используй 3.14.
*/

package syntax.level04;

import java.util.Scanner;

public class Double_09_CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        int radius = scanner.nextInt();
        int S = (int) (pi * radius * radius);
        System.out.println(S);
    }
}
