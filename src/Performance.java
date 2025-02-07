public class Performance {


    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;

        SortingAlgorithm[] algorithms = {
                new BubbleSort(),
                new InsertionSort(),
                new SelectionSort(),
                new ShellSort(),
                new QuickSort(),
                new MergeSort(),
        };
        for (SortingAlgorithm algorithm : algorithms) {
            System.out.println("Sorting algorithm: " + algorithm.getClass().getSimpleName());

            for (int size : sizes) {
                tester tester = new tester(algorithm);
                tester.test(iterations, size);
            }

            System.out.println();
        }
    }

}
