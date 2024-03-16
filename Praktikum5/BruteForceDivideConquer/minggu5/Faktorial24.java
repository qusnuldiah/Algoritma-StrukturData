public class Faktorial24 {
    public int nilai;

   // public int faktorialBF(int n) {
        //int faktor = 1;
        //for (int i = 1; i <= n; i++) {
            //faktor = faktor * i;
       // }
       // return faktor;
   // }

    public int faktorialBF(int n) {
        int faktor = 1;
        int i = 1;
        while (i <= n) {
            faktor = faktor * i;
            i++;
        }
        return faktor;
    }

    public final int faktorialDC(int n) {
        if (n == 0) {
            return 1;
        }
        else
        {
            int faktor = n * faktorialDC(n-1);
            return faktor;
        }
    }
}
