public class RecursionExample {
    public int sum (int n) {
        if (n < 0) {
            n = -n;
        } 
        int s = 0;
        if (n != 0) {
            s = sum(n - 1) + 1;
        }
        return s;
    }
}