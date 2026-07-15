/*
Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
*/

package syntax.level04;

import java.util.Scanner;

public class While_03_Concat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = "любит меня";
        String name = console.nextLine();
        int a = 0;
        while (a < 10) {
            a++;
            System.out.println(name + ' ' + text);
        }
    }
}