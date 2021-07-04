import java.util.Arrays;
  
		//some Arrays class & Arrays class object methods
	    Arrays.toString(arr1);
		
		Arrays.sort(arr1);
		Arrays.parallelSort(arr1);
		Arrays.binarySearch(arr1, 100000);
		
		//Arrays.fill(arr1, from_pos, to_pos, value);
		Arrays.fill(arr1, 5, 10, -1);
		
		//arraycopy(sourceArray, src_pos, targetArray, tar_pos, length);
		System.arraycopy(arr1, 1, arr2, 1, 4);
		
		//reverse Array
        int[] resultArray = new int[arr.length];
        for(int beg = 0, end = arr.length - 1; beg < arr.length; beg++, end--) {
            resultArray[end] = arr[beg];