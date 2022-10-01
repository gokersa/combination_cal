import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r;
        int total1= 1, total2=1, total3=1;
        double combination;

        System.out.println("Kümenin eleman sayısı: ");
        n = input.nextInt();

        System.out.println("Farklı grup sayısı: ");
        r = input.nextInt();

        for (int i=1; i<=n; i++ ) {
            total1 = total1*i;

        }

        for (int i=1; i<=r; i++) {
            total2 = total2*i;
        }

        for (int i=1; i<=(n-r); i++) {
            total3 = total3*i;
        }

        combination = total1 / (total2*total3);
        System.out.println(n + " ve " + r + " sayılarının kombinasyonu:  " + combination + "'dir.");

    }
}
