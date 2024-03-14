public class Main {
    public static int[] genArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = genArr(30);
        int[] arr2 = genArr(100000);

        SortStrategy sortStrategy;

        sortStrategy = new BubbleSort();
        sortStrategy.sort(arr1);
        System.out.println("BubbleSort time for 30 elements: " + sortStrategy.getSortTime() / 1000000 + "ms");
        sortStrategy.sort(arr2);
        System.out.println("BubbleSort time for 100000 elements: " + sortStrategy.getSortTime() / 1000000 + "ms");

        sortStrategy = new QuickSort();
        sortStrategy.sort(arr1);
        System.out.println("QuickSort time for 30 elements: " + sortStrategy.getSortTime() / 1000000 + "ms");
        sortStrategy.sort(arr2);
        System.out.println("QuickSort time for 100000 elements: " + sortStrategy.getSortTime() / 1000000 + "ms");

        sortStrategy = new HeapSort();
        sortStrategy.sort(arr1);
        System.out.println("HeapSort time for 30 elements: " + sortStrategy.getSortTime() / 1000000 + "ms");
        sortStrategy.sort(arr2);
        System.out.println("HeapSort time for 100000 elements: " + sortStrategy.getSortTime() / 1000000 + "ms"); 
    }
}