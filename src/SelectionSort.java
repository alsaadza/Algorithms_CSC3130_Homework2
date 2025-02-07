public class SelectionSort implements SortingAlgorithm {
    public int[] sorty(int[] input) {

        int n = input.length;

        for (int i = 0; i < n - 1; i++) {

            int lowest = i;
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[lowest])
                    lowest = j;
            }

            int tmp = input[lowest];
            input[lowest] = input[i];
            input[i] = tmp;
        }
        return input;
    }
}