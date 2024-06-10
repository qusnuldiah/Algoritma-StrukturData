import java.util.Scanner;

public class GraphMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph24 gedung = new Graph24(6);

        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    try {
                        gedung.removeEdge(asal, tujuan);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan gedung yang akan dihitung degree-nya: ");
                    int vertex = sc.nextInt();
                    try {
                        gedung.degree(vertex);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        gedung.printGraph();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    if (gedung.isConnected(asal, tujuan)) {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    int newJarak = sc.nextInt();
                    gedung.updateJarak(asal, tujuan, newJarak);
                    break;
                case 7:
                    int edgeCount = gedung.hitungEdge();
                    System.out.println("Jumlah Edge dalam Graf: " + edgeCount);
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
        sc.close();
    }
}
