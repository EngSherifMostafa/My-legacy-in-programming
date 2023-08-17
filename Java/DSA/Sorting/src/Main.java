import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1, 8, 2, 9, -15, 0};
        String className = "";

        System.out.println("1- Bubble Sort");
        System.out.println("2- Selection Sort");
        System.out.println("3- Insertion Sort");
        System.out.println("4- Quick Sort");
        System.out.print("Select type of sort: ");
        Scanner scan = new Scanner(System.in);
        int selected = scan.nextInt();

        switch (selected) {
            case 1:
                BubbleSort bs = new BubbleSort();
                bs.sort(arr);
                className = BubbleSort.class.getName();
                break;
            case 2:
                SelectionSort ss = new SelectionSort();
                ss.sort(arr);
                className = SelectionSort.class.getName();
                break;
            case 3:
                InsertionSort is = new InsertionSort();
                is.sort(arr);
                className = InsertionSort.class.getName();
                break;
            case 4:
                QuickSort qs = new QuickSort();
                qs.sort(arr, 0, arr.length - 1);
                className = QuickSort.class.getName();
                break;
            default:
                System.out.println("Error selection");
        }

        System.out.print("Sorted array using " + className + " :\t");
        Helper.printArray(arr);
    }
}