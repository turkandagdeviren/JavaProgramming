package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        //short b = (short)a;
        // (short)a arka planda compiler in yaptigi budur

        int c = b; // implicit costing
        // int c = (int)b

        long d = c;
        //  (long)c

        float e = d;
        double f = e;

        System.out.println("--------------------");

        int x = 55;
        short y = (short) x; // large primitive leri small primitive e convert etmek icin manuel olarak yazmalisin
        //buna casting operating denir

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;

        System.out.println(j+" : " +k);

        double l = 2.5; // i cannot convert double directly to the float since double is larger primitive
        float m = (float) l;








    }





}
