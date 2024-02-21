import java.util.Scanner;

public class Fungsi24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[][] stockAwalCabang = {
            { 10, 6, 2, 5 },
            { 8, 4, 3, 7 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
        };
        int[] hargaBunga = { 75000, 50000, 60000, 10000 };
        int[] penguranganStockCabang4 = { -1, -2, 0, -5 };

        int[][] totalPendapatanCabang = new int[4][5];
        for (int i = 0; i < 4; i++) {
            totalPendapatanCabang[i] = hitungPendapatan(namaBunga, stockAwalCabang[i], hargaBunga);
        }
        
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf("\nCabang %d:\n", i+1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("Pendapatan %s: Rp%d\n", namaBunga[i], totalPendapatanCabang[j][i]);
            }
            int totalPendapatan = totalPendapatanCabang[0][4] + totalPendapatanCabang[1][4] + totalPendapatanCabang[2][4] + totalPendapatanCabang[3][4];
            System.out.printf("Total Pendapatan Cabang %d: Rp%d\n", i+1, totalPendapatan);
        }
        
        int[] totalStockCabang4 = hitungStock(stockAwalCabang[3], penguranganStockCabang4);
        System.out.println("\nTotal Stock Royal Garden 4:");
        System.out.println("========================================");
        System.out.printf("| %-10s | %-10s | %-10s |\n", "Nama Bunga", "Stock Awal", "Total Stock");
        System.out.println("========================================");
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf("| %-10s | %-10d | %-10d |\n", namaBunga[i], stockAwalCabang[3][i], totalStockCabang4[i]);
        }
        System.out.println("========================================");

        input.close();
    }

    static int[] hitungPendapatan(String[] namaBunga, int[] stockAwal, int[] hargaBunga) {
        int[] totalTerjual = new int[namaBunga.length];
        int[] pendapatan = new int[namaBunga.length + 1];
        int totalPendapatan = 0;
        for (int i = 0; i < namaBunga.length; i++) {
            totalTerjual[i] = stockAwal[i];
        }
        for (int i = 0; i < namaBunga.length; i++) {
            pendapatan[i] = totalTerjual[i] * hargaBunga[i];
            totalPendapatan += pendapatan[i];
        }

        pendapatan[4] = totalPendapatan;
        return pendapatan;
    }

    static int[] hitungStock(int[] stockAwal, int[] penguranganStock) {
        int[] totalStock = new int[stockAwal.length]; 

        for (int i = 0; i < stockAwal.length; i++) {
            totalStock[i] = stockAwal[i] + penguranganStock[i];
        }

        return totalStock;
    }
}
