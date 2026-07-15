/*
Используя цикл while вывести на экран сто раз цитату (переменная quote):
«Я никогда не буду работать за копейки. Амиго»
Каждое значение вывести с новой строки.
*/

package syntax.level04;

public class While_03_Quote {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println(quote);
        }
    }
}