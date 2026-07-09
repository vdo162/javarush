/*
Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный, если значение этого элемента чётное.
*/

package syntax.level06;

public class Arr_01_Items {
    public static int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] *= -1;
            }
        }
    }
}