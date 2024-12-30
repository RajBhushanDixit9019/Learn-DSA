// Rotate an Array to left by k places..

// Step 1: Store the first element in a temporary variable

// Step 2: Shift elements one position to the left

// Step 3: Place the first element (stored in temp) at the last position

public class RotateArrayRight {

    public static int[] rotateArrayLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        
        for (int i = 0; i < k; i++) {
            // Step 1: Store the first element in a temporary variable
            int temp = arr[0];
            
            // Step 2: Shift elements one position to the left
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            
            // Step 3: Place the first element (stored in temp) at the last position
            arr[n - 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;

        int[] rotatedArray = rotateArrayLeft(arr, k);

        // output:
        System.out.println("Array after rotating..");
        for (int e : rotatedArray) {
            System.out.print(e + " ");
        }
    }

}
