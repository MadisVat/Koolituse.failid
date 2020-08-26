package ValiIT.Madis;

import java.math.BigDecimal;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        //exercise1();
        //exercise2(52);
        exercise3(15, 12);
        //fibonacci(7); //enne oli 5
        //exercise5();
    }

    //int a = scanner.nextInt();
    //Scanner scanner = new Scanner(System.in);

    public static void exercise1() {

        //  loo 10 elemendile täisarvude massiv
        //  loe sisse konsoolist 10 täisarvu
        //  trüki arvud välja vastupidises järiekorras

        Scanner scanner = new Scanner(System.in);
        int[] m = new int[5];
        System.out.println("Sisestage 5 numbrit!");

        for (int i = 0; i < 5; i++) {
            m[i] = scanner.nextInt();
        }
        System.out.println("Numbrid sisestatud");

        for (int i = 4; i >= 0; i--) {
            System.out.println(m[i]);
        }
    }

    public static void exercise2(int x) {
        // TODO prindi välja x esimest paaris arvu
        // Näide:
        // Sisend 5
        // Väljund 2 4 6 8 10

        for (int i = 2; i <= x * 2; i += 2) {
            System.out.print(i + " ");
        }
        /* SEE ON PAREM by Raivo
        for (int i = 1; i <= x; i++) {
            System.out.print(2 * i + " ");
        } */
    }

    public static void exercise3(int x, int y) {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        //int tabel[ x][y];
        // TODO näiteks x = 3 y = 3
        // TODO väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9
        //int y = x+1;

        for (int j = 1; j <= y; j++) {

            for (int i = 1; i <= x; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }

    public static int fibonacci(int n) {
        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // F1=0, F2=1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element


        int[] a = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {


            //a[2] = a[1] + a[0];
            //a[3] = a[2] + a[1];
            //a[4] = a[3] + a[2];
            //a[5] = a[4] + a[3];
            //a[6] = a[5] + a[4];
            //a[8] = a[7] + a[6];
            //a[n-1] = a[n-2] + a[n-3];


            //for (int i = 0; i <= x; i++) {
            //System.out.println(a[n - 1]);
        }
        return 0;

    }




    public static void exercise5() {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
    }

    public static void exercise6() {
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */
    }

    public static void exercise7() {
        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
        BigDecimal a = new BigDecimal(1.89);
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");
    }

    public static void exercise8() {
        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina.

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */
    }

    public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */
    }

}
