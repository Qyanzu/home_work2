import java.util.Arrays;

public class Lesson_3_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i = i + 1) {
            int result = i * i;
            System.out.println("Result: " + result);
        }
        System.out.println("-------------");
        for (int i = 1; i <= 10; i++) { // i = i + 1 => i++  increment
            System.out.println("5 x " + i + " = " + 5 * i);
        }
        System.out.println("-------------");
        for (int i = 10; i >= 1; i--) { // i = i - 1 => i--  decrement
            System.out.println("7 x " + i + " = " + 7 * i);
        }
        System.out.println("-------------");
        for (int i = 10; i >= 2; i -= 2) { // i -= 2 => i = i - 2; i *= 8 => i = i * 8
            System.out.println("9 x " + i + " = " + 9 * i);
        }
        System.out.println("-------------");
        int a = 0;
        while (a < 5) {
            System.out.println(a);
            a++;
            System.out.println(a / 2.0);
        }
        String str = "JAVA programming language";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.replace("a", "***"));
        str = "#";
        while (str.length() < 5) {
            System.out.println(str);
            str = str + "#";
        }

        String[] robots = new String[10];
        /* robots[0] = "DC001";
        robots[1] = "DC002";
        robots[2] = "DC003";
        robots[3] = "DC004";
        robots[4] = "DC005"; */
        for (int i = 0; i < robots.length; i++) {
            robots[i] = "DC00" + (i + 1);
        }
        System.out.println(Arrays.toString(robots));
        String[] students = {"Bob", "Kevin", "Jane"};
        for (String elem : students) { // for each element in array
            System.out.println("Hi " + elem);
        }

        System.out.println("-------------");
        int[] numbers = {5, -12, 89, -45, 77};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                break; // экстренно прерывает работу всего цикла
            }
            System.out.println(numbers[i]);
        }

        System.out.println("-------------");
        // int[] numbers = {5, -12, 89, -45, 77};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                continue; // прерывает работу текущего круга
            }
            System.out.println(numbers[i]);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Наружный цикл " + i);
            for (int j = 1; j <= 5; j++) { // nested loop
                System.out.println("Внутренний цикл " + j);
            }
        }

        int h = 5;
        System.out.println(h++); // post increment
        int k = 5;
        System.out.println(++k);  // pre increment
        System.out.println("End");
    }
}
