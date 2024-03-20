package Latihan6;

public class MainHotel24 {
    public static void main(String[] args) {
        HotelService24 hotelService = new HotelService24(5);
        hotelService.tambah(new Hotel24("The Langham", "Jakarta", 500000, (byte) 4));
        hotelService.tambah(new Hotel24("Hilton", "Bali", 750000, (byte) 5));
        hotelService.tambah(new Hotel24("Alila", "Solo", 400000, (byte) 3));
        hotelService.tambah(new Hotel24("Tentrem", "Yogyakarta", 600000, (byte) 4));
        hotelService.tambah(new Hotel24("Padma", "Semarang", 1000000, (byte) 5));

        System.out.println("Sebelum Sorting:");
        hotelService.tampilAll();
        System.out.println("\nSetelah Sorting berdasarkan harga (Bubble Sort):");
        hotelService.bubbleSortHarga();
        hotelService.tampilAll();
        System.out.println("\nSetelah Sorting berdasarkan bintang (Selection Sort):");
        hotelService.selectionSortBintang();
        hotelService.tampilAll();
    }
}


