import java.text.DecimalFormat;

public class Sum24 {
    public int jumlahPerusahaan;
    public int[] jumlahBulanPerusahaan;
    public double[][] keuntunganPerusahaan;
    public double[] totalPerusahaan;

    Sum24(int jumlahPerusahaan, int[] jumlahBulanPerusahaan) {
        this.jumlahPerusahaan = jumlahPerusahaan;
        this.jumlahBulanPerusahaan = jumlahBulanPerusahaan;
        this.keuntunganPerusahaan = new double[jumlahPerusahaan][];
        this.totalPerusahaan = new double[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            this.keuntunganPerusahaan[i] = new double[jumlahBulanPerusahaan[i]];
            this.totalPerusahaan[i] = 0;
        }
    }

    double totalBF(double[] arr) {
        double total = 0;
        for (double val : arr) {
            total += val;
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r)
            return arr[l];
        else if (l<r) {
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum + rsum+arr[mid];
        }
        return 0;
    }

    // Fungsi untuk memformat jumlah desimal
    String formatDecimal(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }
}
