public class SortContext {
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] arr) {
        return sortStrategy.sort(arr);
    }

    public double getSortTime() {
        return sortStrategy.getSortTime();
    }
}
