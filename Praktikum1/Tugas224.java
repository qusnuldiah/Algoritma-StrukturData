import java.util.Scanner;
public class Tugas224 {

    public static void hitungKecepatan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = sc.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = sc.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v) = " + kecepatan + " m/s");
        sc.close();
    }

    public static void hitungJarak() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = sc.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = sc.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s) = " + jarak + " meter");
        sc.close();
    }

    public static void hitungWaktu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = sc.nextDouble();

        System.out.print("Masukkan jarak (s): ");
        double jarak = sc.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t) = " + waktu + " detik");
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            int pilihan = sc.nextInt();

            if (pilihan == 4) {
                System.out.println("Terima kasih, program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        }
        sc.close();
    }
}
