import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        fibonacciSequence.setLimit(10);

        Iterator<Integer> iterator = fibonacciSequence.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());

            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
        }

        scanner.close();
    }
}
