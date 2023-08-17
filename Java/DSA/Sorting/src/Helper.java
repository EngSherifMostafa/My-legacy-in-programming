public class Helper {
    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + "\t");
        System.out.println();
    }
}
