package ValiIT.Madis;

public class Lesson3 {

    public static void main(String[] args) {
        //System.out.println(sum(150, 90));
        //int[] x = {10, 20, 30, 40};
        //System.out.println(sum2(x));
        //System.out.println(factorial(5));
        //System.out.println(alg(7));
        //int[] a = {15, 10, 5, 20};
        //System.out.println(Arrays.toString(sort(a)));
        System.out.println(reverseString("Madis"));

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
        //int a = Integer.sum(x, y);
        int a = x + y;
        return a;
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
        if (x != 0)
            return x * factorial(x - 1);
        else
            return 1;
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
        /* VÄLJAPRINDI TEEB KUTSUNG MAIN'IST
        for (int i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1]);
        */
        return a;
    }

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
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        char[] a = a.toCharArray();
        char[] reverseA = new char[a.length];
        return "a";

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


    }

    public static boolean isPrime(int x) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}
