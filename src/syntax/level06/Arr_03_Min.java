/*
Чтобы выполнить эту задачу, тебе нужно:
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
*/

package syntax.level06;

import java.util.Scanner;

public class Arr_03_Min {
    public static int[] array;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();

        if (count > 0) {
            array = new int[count];
            for (int i = 0; i < count; i++) {
                array[i] = console.nextInt();
            }

            int min = array[0];
            for (int i = 1; i < count; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println(min);
        }
    }
}