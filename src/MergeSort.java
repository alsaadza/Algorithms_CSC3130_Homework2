//Merge Sort
public class MergeSort implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        sort(input, 0, input.length - 1);
        return input;
    }

    void merge(int[] input, int left, int mid, int right) {
        int x = mid - left + 1;
        int y = right - mid;
        int[] left_num = new int[x];
        int[] right_num = new int[y];

        System.arraycopy(input, left, left_num, 0, x);
        System.arraycopy(input, mid + 1, right_num, 0, y);

        int i = 0, j = 0;
        int k = left;

        while (i < x && j < y) {

            if (left_num[i] <= right_num[j]) {
                input[k] = left_num[i];
                i++;

            }
            else {

                input[k] = right_num[j];
                j++;

            }

            k++;
        }


        while (i < x) {

            input[k] = left_num[i];
            i++;
            k++;
        }

        while (j < y) {

            input[k] = right_num[j];
            j++;
            k++;

        }
    }

    void sort(int[] input, int left, int right) {
        if (left < right) {

            int mid = left + (right - left) / 2;
            sort(input, left, mid);
            sort(input, mid + 1, right);
            merge(input, left, mid, right);
        }
    }

}