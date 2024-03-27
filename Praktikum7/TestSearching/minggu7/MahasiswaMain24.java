package minggu7;

import java.util.Scanner;

public class MahasiswaMain24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine();

        PencarianMhs24 data = new PencarianMhs24(jumlahMahasiswa);

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data Mahasiswa secara urut dari NIM terbesar : ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("--------------------");
            System.out.print("Nim\t: ");
            int nim = scanner.nextInt();
            scanner.nextLine(); // Consuming newline character
            System.out.print("Nama\t: ");
            String nama = scanner.nextLine();
            System.out.print("Umur\t: ");
            int umur = scanner.nextInt();
            System.out.print("IPK\t: ");
            double ipk = scanner.nextDouble();

            Mahasiswa24 m = new Mahasiswa24(nim, nama,umur, ipk);
            data.tambah(m);
        }

        System.out.println("--------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa: ");
        data.tampil();
        
        System.out.println("________________________________");
        System.out.println("________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama\t: ");
        String cariNama = scanner.nextLine(); // Membersihkan karakter baris baru
        cariNama = scanner.nextLine(); // Membaca nama mahasiswa
        System.out.println("Menggunakan binary Search");
        data.searchAndPrint(cariNama);
        data.searchAllAndPrint(cariNama);
        
        scanner.close();
    }
}
