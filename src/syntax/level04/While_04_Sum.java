/*
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
*/

package syntax.level04;

public class While_04_Sum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}