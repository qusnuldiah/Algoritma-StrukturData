package Latihan6;

public class HotelService24 {
    Hotel24[] room;
    int idx;

    public HotelService24(int size) {
        room = new Hotel24[size];
        idx = 0;
    }

    public void tambah(Hotel24 H) {
        if(idx < room.length) {
            room[idx] = H;
            idx++;
        } else {
            System.out.println("Kamar penuh!");
        }
    }

    public void tampilAll() {
        System.out.println("+----------------------+------------+------------+---------+");
        System.out.println("| Nama Hotel           | Kota       | Harga (Rp) | Bintang |");
        System.out.println("+----------------------+------------+------------+---------+");
        for(Hotel24 h : room) {
            h.printAsTableRow();
        }
        System.out.println("+----------------------+------------+------------+---------+");
    }

    public void bubbleSortHarga() {
        for(int i = 0; i < room.length - 1; i++) {
            for(int j = 0; j < room.length - i - 1; j++) {
                if(room[j].getHarga() > room[j+1].getHarga()) {
                    Hotel24 temp = room[j];
                    room[j] = room[j+1];
                    room[j+1] = temp;
                }
            }
        }
    }

    public void selectionSortBintang() {
        for(int i = 0; i < room.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < room.length; j++) {
                if(room[j].getBintang() > room[minIndex].getBintang()) {
                    minIndex = j;
                }
            }
            Hotel24 temp = room[minIndex];
            room[minIndex] = room[i];
            room[i] = temp;
        }
    }
}