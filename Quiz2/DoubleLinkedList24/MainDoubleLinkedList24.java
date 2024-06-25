package DoubleLinkedList24;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDoubleLinkedList24 {
    public static void main(String[] args) {
        // Membuat objek Double Linked List untuk menyimpan koleksi mobil
        MobilDoubleLinkedList24 mobilList = new MobilDoubleLinkedList24();

        // Menambahkan beberapa mobil ke dalam koleksi
        mobilList.tambahMobil(new Mobil24("001", "Toyota", "Avanza", 2020, "Putih", 200000000, "Mobil keluarga yang ekonomis dan nyaman."));
        mobilList.tambahMobil(new Mobil24("002", "Honda", "Civic", 2019, "Hitam", 350000000, "Sedan sport dengan desain modern dan performa tinggi."));
        mobilList.tambahMobil(new Mobil24("003", "Suzuki", "Ertiga", 2018, "Merah", 180000000, "Mobil MPV dengan kapasitas besar dan fitur lengkap."));
        mobilList.tambahMobil(new Mobil24("004", "Nissan", "Juke", 2021, "Biru", 300000000, "SUV stylish dengan fitur keamanan canggih."));
        mobilList.tambahMobil(new Mobil24("005", "Mazda", "CX-5", 2020, "Putih", 450000000, "SUV mewah dengan performa tinggi dan desain elegan."));
        mobilList.tambahMobil(new Mobil24("006", "Mitsubishi", "Pajero", 2019, "Silver", 500000000, "SUV dengan kapasitas mesin besar dan daya jelajah tinggi."));

        // Membuat objek untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Loop utama untuk menampilkan menu dan menerima input pengguna
        while (true) {
            System.out.println("\n====================================");
            System.out.println("     SISTEM MANAJEMEN DATA MOBIL    ");
            System.out.println("------------------------------------");
            System.out.println("         Double Linked List         ");
            System.out.println("====================================");
            System.out.println("         ______");
            System.out.println("        /  _   \\");
            System.out.println("  _____/  |_|   \\_______");
            System.out.println(" / =                  + \\");
            System.out.println("|   _             _      |");
            System.out.println("|__{ }___________{ }_____|");
            System.out.println("====================================");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Hapus Mobil");
            System.out.println("3. Akses Mobil");
            System.out.println("4. Cetak Semua Mobil");
            System.out.println("5. Urutkan Mobil");
            System.out.println("6. Cari Mobil");
            System.out.println("7. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            // Switch case untuk menangani setiap pilihan menu
            switch (pilihan) {
                case 1:
                    // Tambah mobil baru ke dalam daftar
                    System.out.println("\n====================================");
                    System.out.println("            Tambah Mobil            ");
                    System.out.println("====================================");
                    System.out.print("Masukkan ID: ");
                    String id = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Masukkan Model: ");
                    String model = sc.nextLine();
                    System.out.print("Masukkan Tahun: ");
                    int tahun = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Masukkan Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Masukkan Deskripsi: ");
                    String deskripsi = sc.nextLine();
                    mobilList.tambahMobil(new Mobil24(id, merk, model, tahun, warna, harga, deskripsi));
                    System.out.println("Mobil berhasil ditambahkan!");
                    break;
                case 2:
                    // Hapus mobil dari daftar berdasarkan ID
                    System.out.println("\n====================================");
                    System.out.println("            Hapus Mobil             ");
                    System.out.println("====================================");
                    System.out.print("Masukkan ID yang akan dihapus: ");
                    String idHapus = sc.nextLine();
                    mobilList.hapusMobil(idHapus);
                    System.out.println("Mobil berhasil dihapus!");
                    break;
                case 3:
                    // Akses detail mobil berdasarkan ID
                    System.out.println("\n====================================");
                    System.out.println("            Akses Mobil             ");
                    System.out.println("====================================");
                    System.out.print("Masukkan ID yang akan diakses: ");
                    String idAkses = sc.nextLine();
                    Mobil24 m = mobilList.getMobil(idAkses);
                    if (m != null) {
                        cetakMobil(m);
                    } else {
                        System.out.println("Mobil tidak ditemukan");
                    }
                    break;
                case 4:
                    // Cetak semua mobil dalam daftar
                    System.out.println("\n====================================");
                    System.out.println("         Cetak Semua Mobil          ");
                    System.out.println("====================================");
                    mobilList.cetakSemuaMobil();
                    break;
                case 5:
                    // Sorting
                    System.out.println("\n====================================");
                    System.out.println("           Urutkan Mobil            ");
                    System.out.println("====================================");
                    System.out.println("1. Urutkan berdasarkan ID");
                    System.out.println("2. Urutkan berdasarkan Merk");
                    System.out.println("3. Urutkan berdasarkan Tahun");
                    System.out.print("Pilih metode pengurutan: ");
                    int sortChoice = sc.nextInt();
                    sc.nextLine();
                    switch (sortChoice) {
                        case 1:
                            mobilList.sortById();
                            System.out.println("Mobil berhasil diurutkan berdasarkan ID!");
                            break;
                        case 2:
                            mobilList.sortByMerk();
                            System.out.println("Mobil berhasil diurutkan berdasarkan Merk!");
                            break;
                        case 3:
                            mobilList.sortByTahun();
                            System.out.println("Mobil berhasil diurutkan berdasarkan Tahun!");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    }
                    break;
                case 6:
                    // Searching
                    System.out.println("\n====================================");
                    System.out.println("            Cari Mobil              ");
                    System.out.println("====================================");
                    System.out.println("1. Cari berdasarkan ID");
                    System.out.println("2. Cari berdasarkan Tahun");
                    System.out.print("Pilih metode pencarian: ");
                    int searchChoice = sc.nextInt();
                    sc.nextLine();
                    switch (searchChoice) {
                        case 1:
                            System.out.print("Masukkan ID yang dicari: ");
                            String idCari = sc.nextLine();
                            Mobil24 mobilById = mobilList.searchById(idCari);
                            if (mobilById != null) {
                                cetakMobil(mobilById);
                            } else {
                                System.out.println("Mobil dengan ID " + idCari + " tidak ditemukan.");
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan Tahun yang dicari: ");
                            int tahunCari = sc.nextInt();
                            sc.nextLine();
                            ArrayList<Mobil24> mobilByTahun = mobilList.searchByTahun(tahunCari);
                            if (!mobilByTahun.isEmpty()) {
                                cetakSemuaMobil(mobilByTahun);
                            } else {
                                System.out.println("Tidak ada mobil dengan tahun " + tahunCari + " dalam daftar.");
                            }
                            break;
                        default:
                            System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    }
                    break;
                case 7:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan sistem ini. Sampai jumpa!");
                    sc.close(); // Menutup scanner sebelum keluar dari program
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    // Mencetak detail mobil tertentu.
    private static void cetakMobil(Mobil24 mobil) {
        System.out.println("\n======================================================================================================================================");
        System.out.println("| ID   | Merk       | Model      | Tahun | Warna   | Harga             | Deskripsi                                                   |");
        System.out.println("======================================================================================================================================");
        System.out.printf("| %-4s | %-10s | %-10s | %-5d | %-7s | Rp.%,10.2f | %-59s |\n",
                mobil.getId(), mobil.getMerk(), mobil.getModel(), mobil.getTahun(), mobil.getWarna(), mobil.getHarga(), mobil.getDeskripsi());
        System.out.println("======================================================================================================================================");
    }

    // Mencetak semua mobil dalam daftar.
    private static void cetakSemuaMobil(ArrayList<Mobil24> mobilList) {
        System.out.println("\n======================================================================================================================================");
        System.out.println("| ID   | Merk       | Model      | Tahun | Warna   | Harga             | Deskripsi                                                   |");
        System.out.println("======================================================================================================================================");
        for (Mobil24 mobil : mobilList) {
            System.out.println(mobil);
        }
        System.out.println("======================================================================================================================================");
    }
}
