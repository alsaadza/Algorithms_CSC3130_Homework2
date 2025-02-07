public class QuickSort implements SortingAlgorithm {

    public int[] sorty(int[] array) {
        quickSort2(array, 0, array.length - 1);
        return array;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private int partitionArray(int[] array, int low, int high) {
        int pivot = array[high];
        int leftPointer = low - 1;  // index for smaller element

        for (int rightPointer = low; rightPointer < high; rightPointer++) {
            if (array[rightPointer] <= pivot) {
                leftPointer++;

                swap(array, leftPointer, rightPointer);
            }
        }

        swap(array, leftPointer + 1, high);

        return leftPointer + 1;
    }

    private void quickSort2(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionArray(array, low, high);

            quickSort2(array, low, pivotIndex - 1);
            quickSort2(array, pivotIndex + 1, high);
        }
    }


}
