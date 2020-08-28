package ValiIT.Madis;

public class Lesson1 {

    public static void main(String[] args) {
        excersise1();
        excersise2();
        excersise3();
        excersise4();
    }

    public static void excersise1() {
        // defineeri 3 muutujat a = 1, b = 1, c = 3
        int a = 1;
        int b = 1;
        int c = 3;
        // Prindi välja a==b ja a==c
        System.out.println(a == b && a == c);
        // Lisa rida a = c
        a = c;
        // Prindi välja a==b ja a==c, mis muutus???
        System.out.println(a == b && a == c);
    }

    public static void excersise2() {
        // Loo muutujad x1 = 10 ja x2 = 20, vali sobiv andmetüüp
        int x1 = 10;
        int x2 = 20;
        // Tekita muutuja y1 = ++x1, trüki välja nii x1 kui y1
        int y1 = ++x1;
        System.out.println(x1);
        System.out.println(y1);
        // Tekita muutuja y2 = x2++, trüki välja nii x2 ja y2
        int y2 = x2++;
        System.out.println(x2);
        System.out.println(y2);

        // Analüüsi tulemusi
    }

    public static void excersise3() {
        // Loo arvulised muutujad
        // a = 18 % 3
        // b = 19 % 3
        // c = 20 % 3
        // d = 21 % 3
        int a = 18 % 3;
        int b = 19 % 3;
        int c = 20 % 3;
        int d = 21 % 3;
        // Prindi välja kõigi muutujate väärtused
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void excersise4() {
        // Defineeri String tüüpi muutuja mille sisu oleks "\"\\""
        // Varu - \"\\"\\\"\"
        // Trüki muutuja sisu välja
        System.out.println("\"\\\"\\\\\"\"");
    }

}
