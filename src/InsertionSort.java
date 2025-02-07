public class InsertionSort implements SortingAlgorithm {
    public int[] sorty(int[] input) {

        int n = input.length;

        for (int i = 1; i < n; ++i) {

            int x = input[i];
            int j = i - 1;

            while (j >= 0 && input[j] > x) {
                input[j + 1] = input[j];
                j = j - 1;

            }


            input[j + 1] = x;
        }

        return input;
    }
}