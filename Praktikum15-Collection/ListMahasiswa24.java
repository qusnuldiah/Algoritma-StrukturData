import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa24 {
    List<Mahasiswa24> mahasiswa = new ArrayList<>();

    public void tambah(Mahasiswa24... mahasiswa) {
        this.mahasiswa.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswa.remove(index);
    }

    public void update(int index, Mahasiswa24 mhs) {
        mahasiswa.set(index, mhs);
    }

    public void tampil() {
        mahasiswa.forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    // int linearSearch(String nim) {
        // for (int i = 0; i < mahasiswa.size(); i++) {
            // if (nim.equals(mahasiswa.get(i).nim)) {
                // return i;
            // }
        // }
        // return -1;
    // }

    int binarySearch(String nim) {
        List<String> nims = new ArrayList<>();
        for (Mahasiswa24 mhs : mahasiswa) {
            nims.add(mhs.nim);
        }
        Collections.sort(nims);
        return Collections.binarySearch(nims, nim);
    }

    public void sortingAscending() {
        Collections.sort(mahasiswa, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortingDescending() {
        Collections.sort(mahasiswa, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa24 lm = new ListMahasiswa24();
        Mahasiswa24 m = new Mahasiswa24("201234", "Noureen", "021xx1");
        Mahasiswa24 m1 = new Mahasiswa24("201235", "Akhleema", "021xx2");
        Mahasiswa24 m2 = new Mahasiswa24("201236", "Shannum", "021xx3");
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();
        // update mahasiswa
        // lm.update(lm.linearSearch("201235"), new Mahasiswa24("201235", "Akhleema Lela", "021xx2"));
        lm.update(lm.binarySearch("201235"), new Mahasiswa24("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // Sorting Ascending
        lm.sortingAscending();
        System.out.println("\nSorted Ascending:");
        lm.tampil();
 
        // Sorting Descending
        lm.sortingDescending();
        System.out.println("\nSorted Descending:");
        lm.tampil();
    }
}
