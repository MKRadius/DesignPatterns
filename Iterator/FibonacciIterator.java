import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int count = 0;
    private int current = 1;
    private int next = 1;
    private int limit;

    public FibonacciIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return count < limit;
    }

    @Override
    public Integer next() {
        int result = current;
        int temp = next;
        next = current + next;
        current = temp;
        count++;
        return result;
    }
}

