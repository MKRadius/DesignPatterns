import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    // FibonacciSequence does not need to maintain state itself
    // each iterator will handle its own state
    private int limit; // limit is the number of elements in the sequence

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(limit);
    }
}
