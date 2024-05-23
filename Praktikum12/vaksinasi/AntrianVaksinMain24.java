package vaksinasi;

import java.util.Scanner;

public class AntrianVaksinMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianVaksin24 antrian = new AntrianVaksin24();
        int pilihan;

        antrian.tambahPertama(146, "Rosi");
        antrian.tambahPertama(135, "Johan");
        antrian.tambahPertama(124, "Mely");

        do {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian : ");
                    int noAntrian = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nama Penerima : ");
                    String nama = sc.nextLine();
                    antrian.tambahPertama(noAntrian, nama);
                    break;
                case 2:
                    antrian.hapusPertama();
                    break;
                case 3:
                    antrian.cetak();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
        sc.close();
    }
}
