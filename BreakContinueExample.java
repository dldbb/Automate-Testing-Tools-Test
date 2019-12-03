public class BreakContinueExample {
    public int operation (int n) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (n < 0) {
                sum--;
                continue;
            }
            if (n < i) {
                break;
            }
            sum++;
        }
        return sum;
    }
}