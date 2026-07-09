/*
Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
Каждое значение нужно выводить с новой строки.
*/

package syntax.level04;

public class For_06_EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i < 15; i += 2) {
            System.out.println(i);
        }
    }
}