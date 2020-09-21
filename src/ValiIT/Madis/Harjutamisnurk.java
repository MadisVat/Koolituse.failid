package ValiIT.Madis;

import java.util.HashMap;
import java.util.Scanner;

public class Harjutamisnurk {

    public static void main(String[] args) {
//        miski1();
//        miski2();
//        miski3();
//        miski4();
//        miski5();
            miski6();


    }

    public static void miski1() {
        String a = "midagi";
        String result = "";
        for (int i = a.length(); i > 0; i--) {
            result = result + a.substring(i - 1, i);
        }
        System.out.println(result);
    }

    public static void miski2() {
        Scanner scanner = new Scanner(System.in);
        int[] m = new int[5];
        for (int i = 0; i < 5; i++) {
            m[i] = scanner.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(m[i]);
        }

    }

    public static void miski3() {
        String a1 = "11";
        String a2 = "10";
        boolean miski;
        miski = a1.equals(a2);
        System.out.println(miski);

    }

    public static void miski4() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }


    public static void miski5() {
                for (int i = 2; i <= 10; i=i+2) {
            System.out.println(i * 2);
        }
    }

    public static void miski6() {
        int i = 2;
        while (i<=10){
            System.out.print(i*2+", ");
            i=i+2;
        }
    }

}
