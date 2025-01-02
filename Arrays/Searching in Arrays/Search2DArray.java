// Implement the linear search on 2D arrays

// Steps to search in 2D Array:
// Step 1: Traverse each row of the 2D array
// Step 2: Traverse each column of the current row
// Step 3: Check if the current element is the target element
// Step 4: If found, return true; otherwise, continue searching
// Step 5: If the target element is not found after traversing the entire array, return false

public class Search2DArray {

    // Method to perform linear search on a 2D array
    public static boolean searchIn2DArray(int[][] arr, int target) {
        // Traverse each row of the 2D array
        for (int row = 0; row < arr.length; row++) {
            // Traverse each column of the current row
            for (int col = 0; col < arr[row].length; col++) {
                // Check if the current element is the target element
                if (arr[row][col] == target) {
                    // If found, return true
                    return true;
                }
            }
        }
        // If the target element is not found after traversing the entire array, return
        // false
        return false;
    }

    public static void main(String[] args) {
        // Define a 2D array with some values
        int[][] arr = {
                { 1, 3, 2 },
                { 5, 6, 7 },
                { 18, 12, 13 }
        };

        // Define the target element to search for
        int target = 12;

        // Call the method to search for the target element in the 2D array
        boolean isElementFound = searchIn2DArray(arr, target);

        // Print the result
        if (isElementFound) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found!");
        }
    }
}
