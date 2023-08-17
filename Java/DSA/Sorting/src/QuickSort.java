public class QuickSort {
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                Helper.swap(arr, i, j);
            }
        }

        Helper.swap(arr, ++i, high);
        return i;
    }

    void sort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partition(arr, low, high);
            sort(arr, low, part - 1);
            sort(arr, part + 1, high);
        }
    }
}
