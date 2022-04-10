package day18_NestedLoop;

public class TriangleLoop {
    public static void main(String[] args) {
        int n= 10; //satir sayisi
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) { //her satirda kac tane olacagini belirlemis oluyoruz
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
