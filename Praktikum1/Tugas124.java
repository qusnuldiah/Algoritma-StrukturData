import java.util.Scanner;
public class Tugas124 {

    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'L', 'R', 'T', 'U', 'Z'};

        String[][] kota = {
                {"J", "a", "k", "a", "r", "t", "a"},
                {"S", "u", "r", "a", "b", "a", "y", "a"},
                {"B", "a", "n", "d", "u", "n", "g"},
                {"Y", "o", "g", "y", "a", "k", "a", "r", "t", "a"},
                {"S", "e", "m", "a", "r", "a", "n", "g"},
                {"M", "e", "d", "a", "n"},
                {"M", "a", "k", "a", "s", "s", "a", "r"},
                {"D", "e", "n", "p", "a", "s", "a", "r"},
                {"M", "a", "n", "a", "d", "o"},
                {"P", "e", "k", "a", "n", "b", "a", "r", "u"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        char inputKode = sc.next().charAt(0);

        boolean kodePlat = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                kodePlat = true;
                System.out.print("Kota yang sesuai dengan kode " + inputKode + " adalah: ");
                for (String huruf : kota[i]) {
                    System.out.print(huruf);
                }
                System.out.println();
                break;
            }
        }

        if (!kodePlat) {
            System.out.println("Kode plat mobil tidak valid.");
        }
        sc.close();
    }
}
