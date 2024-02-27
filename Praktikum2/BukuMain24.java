public class BukuMain24 {
    public static void main(String[] args) {
        Buku24 bk1 = new Buku24();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        bk1.tampilInformasi();

        bk1.gantiHarga(60000);
        System.out.println("\nInformasi Buku Setelah Mengganti Harga:");
        bk1.tampilInformasi();

        System.out.println("\nInformasi Buku Sebelum Terjual:");
        bk1.tampilInformasi();

        int jumlahBukuTerjual = 5;
        int hargaTotal = bk1.hitungHargaTotal(jumlahBukuTerjual);
        int diskon = bk1.hitungDiskon(hargaTotal);
        int hargaBayar = bk1.hitungHargaBayar(jumlahBukuTerjual);

        System.out.println("\nSetelah Terjual 5 Buku:");
        System.out.println("Harga Total: " + hargaTotal);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Bayar: " + hargaBayar);

        Buku24 bk2 = new Buku24("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);

        System.out.println("\nInformasi Buku bk2 (Setelah Terjual 11 Buku):");
        int hargaTotalBk2 = bk2.hitungHargaTotal(11);
        int diskonBk2 = bk2.hitungDiskon(hargaTotalBk2);
        int hargaBayarBk2 = bk2.hitungHargaBayar(11);

        System.out.println("Harga Total: " + hargaTotalBk2);
        System.out.println("Diskon: " + diskonBk2);
        System.out.println("Harga Bayar: " + hargaBayarBk2);
        bk2.tampilInformasi();

        Buku24 bukuQusnul = new Buku24("Sagara", "Tere Liye", 384, 20, 89000);
        bukuQusnul.terjual(5);

        System.out.println("\nInformasi Buku bukuQusnul (Setelah Terjual 5 Buku):");
        int hargaTotalQusnul = bukuQusnul.hitungHargaTotal(5);
        int diskonQusnul = bukuQusnul.hitungDiskon(hargaTotalQusnul);
        int hargaBayarQusnul = bukuQusnul.hitungHargaBayar(5);

        System.out.println("Harga Total: " + hargaTotalQusnul);
        System.out.println("Diskon: " + diskonQusnul);
        System.out.println("Harga Bayar: " + hargaBayarQusnul);
        bukuQusnul.tampilInformasi();
    }
}
