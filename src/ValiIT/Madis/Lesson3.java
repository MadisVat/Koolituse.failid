package ValiIT.Madis;

public class Lesson3 {

    public static void main(String[] args) {
        //System.out.println(sum(150, 90));
        //int[] x = {10, 20, 30, 40};
        // System.out.println(sum2(x));
        //System.out.println(factorial(5));
        //System.out.println(alg(7));
        //int[] a = {15, 10, 5, 20};
        //System.out.println(Arrays.toString(sort(a)));
        //System.out.println(reverseString("Madis"));
        System.out.println(isPrime(39));

    }

    private static int alg(int i) {
        //  kui i on paaris arv tagasta i/2
        //  kui i on paaritu arv tagasta i*3+1

        if (i % 2 == 0) {
            return i / 2;
        }
        return i * 3 + 1;
    }

    public static int sum(int x, int y) {
        //liida kokku ja tagasta x ja y väärtus

        int a = x + y;
        return a;
        //int a = Integer.sum(x, y);
    }

    public static int sum2(int[] x) {
        // liida kokku kõik numbrid massivis x

        int arrSum = 0;
        for (int i = 0; i < x.length; i++) {
            arrSum += x[i];
        }
        return arrSum;
    }
    //  for (int i:x)
    //      arrSum += i;

    public static int factorial(int x) {
        // tagasta x faktoriaal.
        // Näiteks: x = 5
        // return 4*3*2*1 = 24
        if (x > 1) {
            return x * factorial(x - 1);
        } else if (x == 1 || x == 0) {
            return 1;
        } else {
            throw new RuntimeException("Error! Negatiivsest arvust ei saa faktoriaali võtta");
        }
    }

    public static int[] sort(int[] a) {
        // sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}

        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        return a;
    }
        /* VÄLJAPRINDI TEEB KUTSUNG MAIN'IST
        for (int i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1]);
        */


    /*for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");


        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[i + 1]) {
                a[0]=
            }
        }

        int arrSum = 0;
        for (int i = 0; i < x.length; i++) {
            arrSum += x[i];
        }
        ========
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        //}
        */

    public static String reverseString(String a) {
        // tagasta string tagurpidi
        // Näiteks: a = "Test";
        // return tseT";

        // RAIVO VARIANT
        // for (int i = 0; i < a.length(); i++) {
        //    result = a.substring(i, i + 1) + result;
        //}

        String result = "";
        for (int i = a.length(); i > 0; i--) {
            result = result + a.substring(i - 1, i);
        }
        return result;
    }
    //for (int i = a.length(); i >= 0; i--) {
    //    System.out.print(a.substring(i-1, i));
    //}

    //char[] a = a.toCharArray();
    //char[] reverseA = new char[a.length];

        /*
        * String numbers = "01010101"
    char[] charNumbers = numbers.toCharArray();
    char[] resultNumbers = new char[numbers.lenght];

    char min = charNumbers[0];
    int index = 0;
    for(int j = 0 ;j=charNumbers.length;j++){
    for(int i = 0 ;i=charNumbers.length;i++){
      if(min<charNumbers[i]){
         index = i;
         min = charNumbers[i];
         }
      }
    resultNumbers[j]=min;
    charNumbers[index] = (char)255;
    }
    * */

    public static boolean isPrime(int x) {
        //  tagasta kas sisestatud arv "x" on primaararv (jagub ainult 1 ja iseendaga)
        if (x <= 1) {
            System.out.println("Esimene algarv on 2");
        } else {
            boolean alg = false;
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    alg = true;
                    break;
                }
            }
            if (!alg) {
                return true;
            }
        }
        return false;
    }
}

