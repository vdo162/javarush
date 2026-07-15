/*
Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.
*/

package syntax.level04;

public class While_03_EmptyRectangle {
    public static void main(String[] args) {
        int a = 0;
        int b;
        String str;
        while (a < 10) {
            a++;
            b = 0;
            while (b < 20) {
                b++;
                str = (a == 1 || a == 10 || b == 1 || b == 20) ? "Б" : " ";
                System.out.print(str);
            }
            System.out.println();
        }
    }
}