package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 1000;
        double lira = dollar * 14.5;
        double euro = dollar * 0.86;
        double kron = lira * 0.11;
        double jpy = dollar * 114.14;
        double cad = dollar * 1.24;


        System.out.println("current dollar amount = $" + dollar);
        System.out.println("kron = " + kron);
        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("jpy = " + jpy);
        System.out.println("cad = " + cad);


        // jpy, pound, peso, cad, riyal, kron, chf, gbp, 10 different currencies


    }


}
