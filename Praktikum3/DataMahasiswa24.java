import java.util.Scanner;
public class DataMahasiswa24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        Mahasiswa24[] arrayMahasiswa = new Mahasiswa24[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.next();
            System.out.print("Masukkan NIM: ");
            String NIM = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            String jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            double IPK = sc.nextDouble();
            arrayMahasiswa[i] = new Mahasiswa24(nama, NIM, jenisKelamin, IPK);
            System.out.println();
        }

        System.out.println("Data Mahasiswa:");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i].cetakInfo();
        }

        double totalIPK = 0;
        for (Mahasiswa24 mahasiswa : arrayMahasiswa) {
            totalIPK += mahasiswa.IPK;
        }

        double rataRataIPK = totalIPK / jumlahMahasiswa;
        System.out.printf("Rata-rata IPK: %.1f\n", rataRataIPK);

        sc.close();
    }
}
