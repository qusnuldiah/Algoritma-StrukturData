public class Mahasiswa24 {
    String nama;
    String NIM;
    String jenisKelamin;
    double IPK;

    public Mahasiswa24(String nama, String NIM, String jenisKelamin, double IPK) {
        this.nama = nama;
        this.NIM = NIM;
        this.jenisKelamin = jenisKelamin;
        this.IPK = IPK;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + IPK);
        System.out.println();
    }
}
