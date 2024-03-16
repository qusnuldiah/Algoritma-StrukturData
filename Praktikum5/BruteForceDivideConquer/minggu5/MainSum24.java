import java.util.Scanner;

public class MainSum24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");

        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();

        int[] jumlahBulanPerusahaan = new int[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            jumlahBulanPerusahaan[i] = sc.nextInt();
        }

        Sum24 sm = new Sum24(jumlahPerusahaan, jumlahBulanPerusahaan);
        System.out.println("================================================");

        for (int i = 0; i < sm.jumlahPerusahaan; i++) {
            System.out.println("Masukkan keuntungan perusahaan ke-" + (i + 1));
            for (int j = 0; j < sm.jumlahBulanPerusahaan[i]; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + ": ");
                sm.keuntunganPerusahaan[i][j] = sc.nextDouble();
            }
        }

        System.out.println("================================================");

        for (int i = 0; i < sm.jumlahPerusahaan; i++) {
            double totalBF = sm.totalBF(sm.keuntunganPerusahaan[i]);
            double totalDC = sm.totalDC(sm.keuntunganPerusahaan[i], 0, sm.jumlahBulanPerusahaan[i] - 1);
            System.out.println("Algoritma Brute Force - Perusahaan ke-" + (i + 1));
            System.out.println("Total keuntungan perusahaan selama " + sm.jumlahBulanPerusahaan[i] + " bulan adalah = " + sm.formatDecimal(totalBF));
            System.out.println("------------------------------------------------");
            System.out.println("Algoritma Divide Conquer - Perusahaan ke-" + (i + 1));
            System.out.println("Total keuntungan perusahaan selama " + sm.jumlahBulanPerusahaan[i] + " bulan adalah = " + sm.formatDecimal(totalDC));
            System.out.println("================================================");
        }

        sc.close();
    }
}
