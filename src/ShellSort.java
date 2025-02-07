public class ShellSort implements SortingAlgorithm {
    public int[] sorty(int[] input) {

        int n = input.length;
        int k = (n/2);

        for (int interv = k; interv > 0; interv /= 2) {
            for (int i = interv; i < n; i += 1) {
                int j;
                int tmp = (input[i]);


                for (j = i; j >= interv && input[j - interv] > tmp; j -= interv) {
                    input[j] = input[j - interv];
                }

                input[j] = tmp;
            }
        }

        return input;
    }
}