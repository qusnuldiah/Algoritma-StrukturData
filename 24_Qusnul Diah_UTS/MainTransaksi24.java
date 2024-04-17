import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainTransaksi24 {
    // Menampilkan data rekening
    public static void tampilDataRekening(Rekening24[] rekening) {
        System.out.println("Data Rekening:");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-20s | %-15s | %-40s |\n", "No Rekening", "Nama", "Nama Ibu", "Phone", "Email");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        for (Rekening24 rek : rekening) {
            System.out.printf("| %-15s | %-15s | %-20s | %-15s | %-40s |\n", rek.noRekening, rek.nama, rek.namaIbu, rek.phone, rek.email);
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }

    // Menampilkan data transaksi
    public static void tampilDataTransaksi(Transaksi24[] transaksi) {
        System.out.println("Data Transaksi:");
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-15s | %-20s |\n", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal Transaksi");
        System.out.println("------------------------------------------------------------------------------");
        for (Transaksi24 trans : transaksi) {
            System.out.printf("| %-15.2f | %-15.2f | %-15.2f | %-20s |\n", trans.saldo, trans.saldoAwal, trans.saldoAkhir, trans.tanggalTransaksi);
        }
        System.out.println("------------------------------------------------------------------------------");
    }

    // Mencari transaksi dengan saldo > 500000
    public static void mencariSaldoLebihDari500K(Transaksi24[] transaksi) {
        System.out.println("Transaksi dengan saldo lebih dari 500000:");
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-15s | %-20s |\n", "Saldo", "Saldo Awal", "Saldo Akhir", "Tanggal Transaksi");
        System.out.println("------------------------------------------------------------------------------");
        for (Transaksi24 trans : transaksi) {
            if (trans.saldo > 500000) {
                System.out.printf("| %-15.2f | %-15.2f | %-15.2f | %-20s |\n", trans.saldo, trans.saldoAwal, trans.saldoAkhir, trans.tanggalTransaksi);
            }
        }
        System.out.println("------------------------------------------------------------------------------");
    }

    // Mengurutkan data rekening berdasarkan nama
    public static void sortingByName(Rekening24[] rekening) {
        System.out.println("Sorting by Name:");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-20s | %-15s | %-40s |\n", "No Rekening", "Nama", "Nama Ibu", "Phone", "Email");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        
        ArrayList<Rekening24> rekeningList = new ArrayList<>();
        for (Rekening24 rek : rekening) {
            rekeningList.add(rek);
        }
        Collections.sort(rekeningList, new Comparator<Rekening24>() {
            public int compare(Rekening24 r1, Rekening24 r2) {
                return r1.nama.compareTo(r2.nama);
            }
        });

        // Menampilkan hasil sorting
        for (Rekening24 rek : rekeningList) {
            System.out.printf("| %-15s | %-15s | %-20s | %-15s | %-40s |\n", rek.noRekening, rek.nama, rek.namaIbu, rek.phone, rek.email);
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Inisialisasi data rekening
        Rekening24[] rekening = {
            new Rekening24("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"),
            new Rekening24("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"),
            new Rekening24("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"),
            new Rekening24("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"),
            new Rekening24("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"),
            new Rekening24("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca"),
            new Rekening24("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"),
            new Rekening24("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"),
            new Rekening24("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"),
            new Rekening24("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"),
            new Rekening24("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"),
            new Rekening24("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"),
            new Rekening24("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net"),
            new Rekening24("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu"),
            new Rekening24("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk"),
            new Rekening24("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca"),
            new Rekening24("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"),
            new Rekening24("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com"),
            new Rekening24("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com")
        };
        
        // Inisialisasi data transaksi
        Transaksi24[] transaksi = {
            new Transaksi24(898214, 494048, 3587, "2021-03-09 07:54:42"),
            new Transaksi24(205420, 200162, 775880, "2021-06-25 10:23:00"),
            new Transaksi24(838632, 350929, 328316, "2021-09-18 23:00:04"),
            new Transaksi24(230659, 204434, 690503, "2022-02-02 19:10:34"),
            new Transaksi24(770592, 334245, 444267, "2020-08-11 13:36:56"),
            new Transaksi24(685302, 451002, 376442, "2020-05-23 07:34:53"),
            new Transaksi24(816129, 851403, 597842, "2021-07-18 19:41:20"),
            new Transaksi24(989609, 333823, 802752, "2022-02-01 01:13:11"),
            new Transaksi24(297103, 396116, 779589, "2021-07-03 01:09:49"),
            new Transaksi24(66190, 259150, 619774, "2021-09-09 03:57:30"),
            new Transaksi24(234301, 278309, 547922, "2021-08-24 13:18:39"),
            new Transaksi24(243306, 869468, 50283, "2021-03-12 03:40:16"),
            new Transaksi24(371045, 991242, 602034, "2021-08-06 11:48:59"),
            new Transaksi24(395170, 97058, 472273, "2021-05-02 10:53:31"),
            new Transaksi24(862731, 561908, 109431, "2021-07-31 08:11:00"),
            new Transaksi24(556798, 31387, 725426, "2021-03-27 06:18:20"),
            new Transaksi24(873982, 896213, 846142, "2021-07-18 04:06:30"),
            new Transaksi24(774247, 739406, 775848, "2020-10-24 01:39:00"),
            new Transaksi24(66987, 823014, 868772, "2020-12-21 05:57:59")
        };
        
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Menampilkan menu
            System.out.print("==============================");
            System.out.println("\nUTS :");
            System.out.println("------------------------------");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari Saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilDataRekening(rekening);
                    break;
                case 2:
                    tampilDataTransaksi(transaksi);
                    break;
                case 3:
                    mencariSaldoLebihDari500K(transaksi);
                    break;
                case 4:
                    sortingByName(rekening);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    input.close();
    }
}