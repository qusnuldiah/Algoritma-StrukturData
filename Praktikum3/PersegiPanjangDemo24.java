import java.util.Scanner;
public class PersegiPanjangDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = sc.nextInt();
        PersegiPanjang24[] arrayOfPersegiPanjang = new PersegiPanjang24[panjangArray];

        int panjang, lebar;

        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = sc.nextInt();

            int luas = panjang * lebar;
            int keliling = 2 * (panjang + lebar);

            arrayOfPersegiPanjang[i] = new PersegiPanjang24(panjang, lebar, luas, keliling);
        }

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Persegi panjang ke-" + (i + 1) + ": ");
            arrayOfPersegiPanjang[i].cetakInfo();
        }
        sc.close();
    }
}
