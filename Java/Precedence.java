import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		testOne();
		testTwo();
	}
	
	public static void testOne() {
		int[] arr = { 5, 1, 15, 20, 25 };
        
        int i = ++arr[1]; // i = 2, arr = [5, 2, 15, 20, 25]
        int j = arr[1]++; // j = 2, arr = [5, 3, 15, 20, 25]
        int m = arr[i++]; // m = 15, i = 3, arr = [5, 3, 15, 20, 25]
        
        System.out.println("i = " + i + "\n" + "j = " + j + "\n" + "m = " + m);
        System.out.println(Arrays.toString(arr));
	}
	
	public static void testTwo() {
        int x = 3;
        int y = ++x * 5 * x--;
        System.out.println("x is " + x); // x is 3
        System.out.println("y is " + y); // y is 80
	}
}