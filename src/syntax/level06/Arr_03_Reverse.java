/*
Тебе нужно написать программу, которая:
Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
*/

package syntax.level06;

import java.util.Scanner;

public class Arr_03_Reverse {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();

        if (count > 0) {
            int[] array = new int[count];
            for (int i = 0; i < count; i++) {
                array[i] = console.nextInt();
            }

            if (count % 2 == 0) {
                for (int i = count - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}