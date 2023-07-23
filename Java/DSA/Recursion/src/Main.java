public class Main {
    static int depth = 0;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(binarySearch(arr, 4, 0, arr.length - 1));
        System.out.println("Depth = " + depth);


        System.out.println("Before reverse");
        for (int ele : arr)
            System.out.print(ele + "\t");

        reverseArray(arr, 0, arr.length - 1);

        System.out.println("\nAfter reverse");
        for (int ele : arr)
            System.out.print(ele + "\t");

        System.out.println("\n\n");
        System.out.println("binarySum: " + binarySum(arr, 0, arr.length - 1));
    }


    //Linear Recursion
    static int[] reverseArray(int[] dataSet, int low, int high) {
        if (low < high) {
            int swap = dataSet[low];
            dataSet[low] = dataSet[high];
            dataSet[high] = swap;

            return reverseArray(dataSet, low + 1, high - 1);
        }
        return dataSet;
    }

    static boolean binarySearch(int[] dataSet, int target, int low, int high) {
        if (low > high)
            return false;

        int middle = (low + high) / 2;
        if (dataSet[middle] == target)
            return true;
        else if (dataSet[middle] > target) {
            depth++;
            return binarySearch(dataSet, target, low, middle - 1);
        } else {
            depth++;
            return binarySearch(dataSet, target, middle + 1, high);
        }
    }


    //Binary Recursion
    static long binarySum(int[] dataSet, int low, int high) {
        if (low > high)
            return 0;

        else if (low == high)
            return dataSet[low];

        int middle = (low + high) / 2;
        return binarySum(dataSet, low, middle) + binarySum(dataSet, middle + 1, high);
    }
}