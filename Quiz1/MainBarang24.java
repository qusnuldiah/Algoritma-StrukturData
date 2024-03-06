import java.util.ArrayList;
import java.util.Scanner;

public class MainBarang24 {
    public static void main(String[] args) {
        // Inisialisasi data barang
        Barang24 barang1 = new Barang24("K01", "Sabun", 1000, 5);
        Barang24 barang2 = new Barang24("K02", "Pasta Gigi", 2000, 10);
        Barang24 barang3 = new Barang24("K03", "Biore", 3000, 23);
        Barang24 barang4 = new Barang24("K04", "Shampoo", 4000, 55);
        Barang24 barang5 = new Barang24("K05", "Sikat Gigi", 5000, 65);

        // Inisialisasi daftar barang
        ArrayList<Barang24> daftarBarang = new ArrayList<>();
        daftarBarang.add(barang1);
        daftarBarang.add(barang2);
        daftarBarang.add(barang3);
        daftarBarang.add(barang4);
        daftarBarang.add(barang5);

        // Inisialisasi objek TransaksiBarang
        TransaksiBarang transaksi = new TransaksiBarang();

        // Menampilkan menu
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        char lanjutBeli;

        do {
            System.out.println("==========================");
            System.out.println("TOKO MAJU MUNDUR CANTIK");
            System.out.println("==========================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih [1-4]: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Menampilkan daftar barang
                    transaksi.tampilkanBarang(daftarBarang);
                    break;
                case 2:
                    // Melakukan pembelian
                    do {
                        System.out.print("Masukkan kode barang yang akan dibeli: ");
                        String kodeBarang = scanner.next();
                        System.out.print("Masukkan jumlah barang yang akan dibeli: ");
                        int jumlah = scanner.nextInt();
                        transaksi.melakukanPembelian(daftarBarang, kodeBarang, jumlah);

                        // Konfirmasi apakah ingin melanjutkan pembelian
                        System.out.print("Apakah Anda ingin melanjutkan pembelian? (y/n): ");
                        lanjutBeli = scanner.next().charAt(0);
                    } while (lanjutBeli == 'y' || lanjutBeli == 'Y');
                    break;
                case 3:
                    // Menampilkan daftar barang yang telah dibeli
                    System.out.println("==========================");
                    System.out.println("LIST BELANJAAN");
                    System.out.println("==========================");
                    transaksi.tampilkanPembelian();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } while (pilihan != 4);
        scanner.close();
    }
}
