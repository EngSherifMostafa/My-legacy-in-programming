public class BubbleSort {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 1; j < arr.length - i; j++)
                if (arr[j] < arr[j - 1])
                    Helper.swap(arr, j, j - 1);
    }
}