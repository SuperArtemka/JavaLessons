public class HomeWorkApp {
    public static void main(String[] args) { // Первое задание
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {  // Второе задание
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {    // Третье задание
        int a = 10, b = 20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {     // Четвертое задание
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value >= 1 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value >= 101) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {    // тут я так и не разобрался
        int a = 20, b = 30;
        if (a >= b) {
            System.out.println(a>=b);
        } else {
            System.out.println(a < b);
        }

    }
}
