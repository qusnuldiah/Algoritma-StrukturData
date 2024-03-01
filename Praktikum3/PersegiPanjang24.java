public class PersegiPanjang24 {
    public int panjang;
    public int lebar;

    // Constructor pertama
    public PersegiPanjang24(int p, int l) {
        panjang = p;
        lebar = l;
    }

    // Constructor kedua
    public PersegiPanjang24(int p, int l, int luas, int keliling) {
        panjang = p;
        lebar = l;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void cetakInfo() {
        System.out.println("Panjang: " + panjang + ", Lebar: " + lebar + ", Luas: " + hitungLuas() + ", Keliling: " + hitungKeliling());
    }
}
