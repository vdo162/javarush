/*
В этой задаче тебе нужно:
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
*/

package syntax.level06;

import java.util.Scanner;

public class Arr_03_Max {
    public static int[] array;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();

        if (count > 0) {
            array = new int[count];
            for (int i = 0; i < count; i++) {
                array[i] = console.nextInt();
            }

            int max = array[0];
            for (int i = 1; i < count; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println(max);
        }
    }
}