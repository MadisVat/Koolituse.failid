package ValiIT.Madis;

import java.util.Scanner;

public class Lesson1MathUtil {

    public static void main(String[] args) {
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Palun sisestage 2 numbrit!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(min(a, b));
        // loeb 1 täisarvu2
        //String rida = scanner.nextLine();
        // loeb teksti kuni rea vahetuseni */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Palun sisestage funktsioon valikust: abs, min2, max2, isEven, min3, max3");
        String sisend = scanner.nextLine();

        if (sisend.equals("min2")) {
            System.out.println("Palun sisestage 2 numbrit");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("väikseim number = " + min(a, b));

        } else if (sisend.equals("max2")) {
            System.out.println("Palun sisestage 2 numbrit");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("suurim number = " + max(a, b));

        } else if (sisend.equals("min3")) {
            System.out.println("Palun sisestage 3 numbrit");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("väikseim number = " + min(a, b, c));

        } else if (sisend.equals("max3")) {
            System.out.println("Palun sisestage 3 numbrit");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("suurim number = " + max(a, b, c));

        } else if (sisend.equals("abs")) {
            System.out.println("Palun sisestage 1 number");
            int a = scanner.nextInt();
            System.out.println("Numbri absoluutväärtus = " + abs(a));

        } else if (sisend.equals("isEven")) {
            System.out.println("Palun sisestage 1 number");
            int a = scanner.nextInt();
            if (isEven(a)) {
                System.out.println("Sisestatud number on paarisarv");
            } else {
                System.out.println("Sisestatud number ei ole paarisarv");
            }

        }
    }

    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        if (a >= 0) {
            return a;
        }
        return a * (-1);
    }

    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        if (a % 2 == 0) {
            return true;
        }
        // tagasta false kui a on paaritu arv
        return false;
    }

    public static int min(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        }
        return c;

        // PAREM VARIANT!.... return max(a, max(b, c));

    }

    public static int max(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        }
        return c;
    }


}
