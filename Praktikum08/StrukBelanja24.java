public class StrukBelanja24 {

    int nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHarga;

    public StrukBelanja24(int nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHarga) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHarga = totalHarga;
    }

    public void displayInfo() {
        System.out.println("Nomor Transaksi: " + nomorTransaksi);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println();
    }
}