public class SearchInRange {
    // The linear search implemented to search in the range in array
    public static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Search in the specified range from start to end
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        
        // Element not found in the range
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int start = 2;
        int end = 6;
        int result = linearSearch(arr, target, start, end);
        System.out.println("Element found at index: " + result);
    }
}
