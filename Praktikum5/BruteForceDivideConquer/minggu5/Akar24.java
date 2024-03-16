public class Akar24 {
    // Algoritma Brute Force untuk menghitung akar kuadrat
    public static int AkarBF(int n) {
        if (n == 0 || n == 1)
            return n;

        int i = 1, bilangan = 1;

        while (bilangan <= n) {
            i++;
            bilangan = i * i;
        }
        return i - 1;
    }

    // Algoritma Divide Conquer untuk menghitung akar kuadrat
    public static int AkarDC(int n) {
        if (n == 0 || n == 1)
            return n;

        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n)
                return mid;
            if (mid * mid < n) {
                start = mid + 1;
                ans = mid;
            } else
                end = mid - 1;
        }
        return ans;
    }

}
