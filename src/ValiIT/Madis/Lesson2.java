package ValiIT.Madis;

import java.math.BigDecimal;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        //exercise1();
        //exercise2(5);
        //exercise3(3, 4);
        System.out.println(arvutus(10));

        // FIBONACCI
        /*int n = 9;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }*/

        //System.out.print(fibonacci(16));
//        System.out.println(exercise5(10,);

        // EX 5
        //int n = 15;
        //if (n > 1) {
        //    System.out.println(exercise5(n));
        //}
        //return n;

    }


    //System.out.print(exercise5(15));
    // SISESTAMINE mingiF(); //+altshifenter tekitab meetodi full auto


    //int a = scanner.nextInt();
    //Scanner scanner = new Scanner(System.in);

    public static void exercise1() {
        //  loo 5 elemendile täisarvude massiv
        //  loe sisse konsoolist 5 täisarvu
        //  trükij arvud väla vastupidises järiekorras

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
        //  prindi välja x esimest paaris arvu
        // Näide: Sisend 5
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
        //  trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        //  näiteks x = 3 y = 3
        //  väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9

        for (int j = 1; j <= y; j++) {

            for (int i = 1; i <= x; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }

    public static int fibonacci(int n) {
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // F1=0, F2=1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element

        if (n > 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        }
        return 0;
    }

/*
        int[] a = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            n =

            //a[2] = a[1] + a[0];
            //a[3] = a[2] + a[1];
            //a[4] = a[3] + a[2];
            //a[5] = a[4] + a[3];
            //a[6] = a[5] + a[4];
            //a[8] = a[7] + a[6];
            //a[n-1] = a[n-2] + a[n-3];


            //for (int i = 0; i <= x; i++) {
            //System.out.println(a[n - 1]);
       }*/


    // ALGNE == public static void exercise5() {
    public static void exercise5(int n) {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
        /*Consider the following algorithm:
        1. input n
        2. print n
        3. if n = 1 then STOP
        4. if n is odd then n ←− 3n + 1
        5. else n ←− n/2
        6. GOTO 2
        Given the input 22, the following sequence of numbers will be printed
        22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
        It is conjectured that the algorithm above will terminate (when a 1 is printed) for any integral input
        value. Despite the simplicity of the algorithm, it is unknown whether this conjecture is true. It has
        been verified, however, for all integers n such that 0 < n < 1, 000, 000 (and, in fact, for many more
        numbers than this.)
        Given an input n, it is possible to determine the number of numbers printed before and including
        the 1 is printed. For a given n this is called the cycle-length of n. In the example above, the cycle
        length of 22 is 16.
        For any two numbers i and j you are to determine the maximum cycle length over all numbers
        between and including both i and j.
                Input
        The input will consist of a series of pairs of integers i and j, one pair of integers per line. All integers
        will be less than 10,000 and greater than 0.
        You should process all pairs of integers and for each pair determine the maximum cycle length over
        all integers between and including i and j.
        You can assume that no operation overflows a 32-bit integer.
                Output
        For each pair of input integers i and j you should output i, j, and the maximum cycle length for
        integers between and including i and j. These three numbers should be separated by at least one space
        with all three numbers on one line and with one line of output for each line of input. The integers i
        and j must appear in the output in the same order in which they appeared in the input and should be
        followed by the maximum cycle length (on the same line). */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Palun sisestage jada vahemiku algus(0<) ja lõpp(<10000)");
        int algus = scanner.nextInt();
        int löpp = scanner.nextInt();
//läbi teha kõik algusest lõppu fori'ga
// peaks väljastama vahemiku kohta pikima ringi


    }

    //peaks väljastama counteriga, et mitu ringi tegi
    public static int arvutus(int n) {
        int counter = 0;
        int x = n;
        while (!(n == 1)) {
            if (n % 2 != 0) {
                n = n * 3 + 1;
            } else {
                n = n / 2;
            }
            counter++;
        }
        System.out.println(x + ". Count: " + counter);
        return counter;
    }


    //päriselt raske
    public static void exercise6() {

        //   TODO Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
        //   TODO a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
        //  b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
        //   Faili asukoht tuleb programmile ette anda käsurea parameetrina.

    }

    public static void exercise7() {
        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
        BigDecimal a = new BigDecimal(1.89);
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");
    }

    //päriselt raske
    public static void exercise8() {

        //    TODO Failis nums.txt on üksteise all 150 60 - kohalist numbrit.

        //          TODO Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks
        //   ekraanil summa.
        //   TODO Faili nimi tuleb programmile ette anda käsurea parameetrina.

        //          VASTUS:
        //   Õige summa:77378062799264987173249634924670947389130820063105651135266574

    }

    //päriselt raske
    public static void exercise9() {
        // TODO
        // TODO Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi

    }

}
