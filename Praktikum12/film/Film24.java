package film;

public class Film24 {
    int id;
    String judul;
    double rating;
    Film24 prev, next;

    public Film24(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
}


