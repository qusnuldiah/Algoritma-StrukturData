import java.util.Scanner;

public class StackMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackPakaian24 stk = new StackPakaian24(5);

        char pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push (Tambah data pakaian)");
            System.out.println("2. Pop (Hapus data pakaian)");
            System.out.println("3. Peek (Lihat data pakaian teratas)");
            System.out.println("4. Print (Tampilkan semua data pakaian)");
            System.out.println("5. Tampilkan Pakaian dengan Harga Tertinggi");
            System.out.println("6. Keluar");

            System.out.print("Pilih menu (1-6): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();

                    Pakaian24 p = new Pakaian24(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;

                case 2:
                    System.out.println("-----------------------------");
                    stk.pop();
                    break;

                case 3:
                    System.out.println("-----------------------------");
                    stk.peek();
                    break;

                case 4:
                    System.out.println("-----------------------------");
                    stk.print();
                    break;

                case 5:
                    System.out.println("-----------------------------");
                    stk.getMax();
                    break;

                case 6:
                    System.out.println("-----------------------------");
                    System.out.println("Keluar dari program.");
                    break;

                default:
                // Jika pilihan menu tidak valid
                    System.out.println("-----------------------------");
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }

            if (menu != 6) {
                System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
                pilih = sc.next().charAt(0);
                sc.nextLine();
            } else {
                pilih = 'n'; // Keluar dari loop jika pilihan menu adalah 6
            }

        } while (pilih == 'y');

        sc.close();
    }
}
