public class LatencyTracker {
    private int emaLatency = 0; // Giá trị EMA ban đầu
    private final double alpha; // Hệ số làm mịn

    public LatencyTracker(double alpha) {
        this.alpha = alpha;
    }

    public void addLatency(int newLatency) {
        if (emaLatency == 0) {
            emaLatency = newLatency;
        } else {
            emaLatency = (int)(alpha * newLatency + (1 - alpha) * emaLatency);
        }
    }

    public int getAverageLatency() {
        return emaLatency;
    }
}