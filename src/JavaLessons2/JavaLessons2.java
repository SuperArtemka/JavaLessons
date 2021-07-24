package JavaLessons2;

public class JavaLessons2 {
    public static int a = 5;
    public static int b = 10;

    public static void main(String[] args) {
        sumNumbers();
        numberTwo();
        numberThree();
        numberFour(value:"Hey", count:5);
    }

            public static boolean sumNumbers() {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }
        public static void numberTwo() {
            if (a >= 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        }
        public static boolean numberThree() {
            if (a < 0) {
            return true;
            } else {
            return false;
        }

            public static void numberFour(String value, int count) {
                for (int i = 0; i >= count; i++) {
                    System.out.println("Number" + i + value);
                }
            }





}
