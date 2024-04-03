import java.util.Scanner;
public class MainBelanja24 {
    public static void main(String[] args) {
        StackBelanja24 stack = new StackBelanja24(8);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Masukkan data untuk struk belanja ke-" + (i + 1) + ":");
            System.out.print("Nomor Transaksi: ");
            int nomorTransaksi = sc.nextInt();
            sc.nextLine();
            System.out.print("Tanggal Pembelian: ");
            String tanggalPembelian = sc.nextLine();
            System.out.print("Jumlah Barang: ");
            int jumlahBarang = sc.nextInt();
            System.out.print("Total Harga: ");
            double totalHarga = sc.nextDouble();
            sc.nextLine();

            StrukBelanja24 struk = new StrukBelanja24(nomorTransaksi, tanggalPembelian, jumlahBarang, totalHarga);
            stack.push(struk);
        }

        sc.close();

        stack.print();

        // Mengambil lima struk belanja untuk ditukarkan dengan voucher
        System.out.println("\nStruk belanja yang akan ditukarkan dengan voucher:");
        for (int i = 0; i < 5; i++) {
            StrukBelanja24 struk = stack.pop();
            if (struk != null) {
                struk.displayInfo();
            }
        }
    }
}