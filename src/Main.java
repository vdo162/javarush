public class Main {
    /*
        System.exit(0);
        break;
        continue;

        System.out.println("str");
        System.out.print('s');

        import java.util.Scanner;
        Scanner console = new Scanner(System.in);

        console.nextLine();
        s1.equals(s2);
        s1.equalsIgnoreCase(s2)
        console.nextBoolean();

        int s = Integer.parseInt(console.nextLine())
        console.hasNextInt();
        int s = console.nextInt();
        Integer.MIN_VALUE;
        Integer.MAX_VALUE;

        (int) Math.round()


        import java.util.Arrays;
        Arrays.sort(array), .binarySearch(array, 5) и .toString(array)
        Дефолтные: числа — 0, boolean — false, ссылочные типы — null
        array.length
    */
    public static void main(String[] args) {
        System.out.println("Hello word!");
    }

    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public static int combat(int health, int damage) {
        return health > damage ? health - damage : 0;
    }

    public static int move(int position, int roll) {
        return position + roll * 2;
    }
}