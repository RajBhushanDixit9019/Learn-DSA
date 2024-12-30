//Check if an Array is Sorted
// Algorithm: Steps to check if an array is sorted in strictly increasing order

//Step 1: Initialize the first element of the array (`arr[0]`) as `max`.

//Step 2: Start iterating through the array from the second element (`i = 1`).

//Step 3: Compare each element (`arr[i]`) with the current `max`:
      //  - If `arr[i]` is greater than `max`, update `max = arr[i]` and proceed to the next element.
     // - If `arr[i]` is less than or equal to `max`, return `false` (array is not sorted).

//Step 4: If the iteration completes without any violations, return `true` (array is sorted).




public class IsArraySorted {

    public static boolean isArraySorted(int[] arr) {
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                i++;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Array..
        int[] arr = { 2, 5, 7};

        if (isArraySorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
