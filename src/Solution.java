import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int number = scanner.nextInt();

        do {
            System.out.println(str);
            number--;
        } while (number > 0 && number < 4);
    }
}