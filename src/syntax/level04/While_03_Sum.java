/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.
*/

package syntax.level04;

import java.util.Scanner;

public class While_03_Sum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = "";
        int sum = 0;
        while (!str.equals("ENTER")) {
            if (console.hasNextInt()) {
                sum += console.nextInt();
            } else {
                str = console.nextLine();
            }
        }
        System.out.println(sum);
    }
}