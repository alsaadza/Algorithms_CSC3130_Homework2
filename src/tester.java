public class tester {
    private final SortingAlgorithm sortingAlgorithm;

    public tester(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public double singleTest(int size) {
        int[] testArray = new int[size];
        for (int i = 0; i < size; i++) {

            testArray[i] = (int) (Math.random() * size);

        }


        long startTime = System.nanoTime();
        sortingAlgorithm.sorty(testArray);
        long endTime = System.nanoTime();

        return ((endTime - startTime) / 1e6);
    }

    public double test(int iterations, int size) {

        double totalTime = 0;

        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }

        double averageTime = totalTime / iterations;
        System.out.println("Sorted " + size + " elements in " + averageTime +" ms (avg)");
        return averageTime;
    }

}