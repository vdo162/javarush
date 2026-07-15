/*
Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.
*/

package syntax.level04;

public class While_03_Rectangle {
    public static void main(String[] args) {
        int a = 0;
        int b;
        while (a < 5) {
            a++;
            b = 0;
            while (b < 10) {
                b++;
                System.out.print("Q");
            }
            System.out.println();
        }
    }
}