package film;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaftarFilm24 daftar = new DaftarFilm24();
        int pilihan;

        daftar.tambahAwal(1346, "Uncharted", 6.7);
        daftar.tambahAwal(1234, "Death On The Nile", 6.6);
        daftar.tambahAwal(1567, "The Dark Knight Rises", 8.4);
        daftar.tambahAwal(1765, "Skyfall", 7.8);

        do {
            System.out.println("===========================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===========================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Ranking Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===========================");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film: ");
                    int idAwal = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulAwal = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingAwal = sc.nextDouble();
                    daftar.tambahAwal(idAwal, judulAwal, ratingAwal);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("ID Film: ");
                    int idAkhir = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulAkhir = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingAkhir = sc.nextDouble();
                    daftar.tambahAkhir(idAkhir, judulAkhir, ratingAkhir);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film pada Index Tertentu");
                    System.out.println("ID Film: ");
                    int idIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String judulIndex = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double ratingIndex = sc.nextDouble();
                    System.out.println("Posisi Index: ");
                    int posisiIndex = sc.nextInt();
                    daftar.tambahIndex(idIndex, judulIndex, ratingIndex, posisiIndex);
                    break;
                case 4:
                    daftar.hapusAwal();
                    System.out.println("Data pertama berhasil dihapus.");
                    break;
                case 5:
                    daftar.hapusAkhir();
                    System.out.println("Data terakhir berhasil dihapus.");
                    break;
                case 6:
                    System.out.println("Masukkan ID Film yang akan dihapus: ");
                    int idHapus = sc.nextInt();
                    int posisiHapus = daftar.cari(idHapus);
                    if (posisiHapus != -1) {
                        daftar.hapusIndex(posisiHapus);
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Data ID Film tidak ditemukan.");
                    }
                    break;
                case 7:
                    daftar.cetak();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film yang dicari: ");
                    int idCari = sc.nextInt();
                    int posisi = daftar.cari(idCari);
                    if (posisi != -1) {
                        System.out.println("Data ID Film: " + idCari + " berada di node ke-" + posisi);
                        System.out.println("IDENTITAS:");
                        Film24 film = daftar.head;
                        for (int i = 1; i < posisi; i++) {
                            film = film.next;
                        }
                        System.out.println("ID Film: " + film.id);
                        System.out.println("Judul Film: " + film.judul);
                        System.out.println("Rating Film: " + film.rating);
                    } else {
                        System.out.println("Data ID Film tidak ditemukan.");
                    }
                    break;
                case 9:
                    daftar.urutkanRatingDesc();
                    System.out.println("Data berhasil diurutkan berdasarkan Rating secara descending.");
                    break;
                case 10:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 10);

        sc.close();
    }
}


