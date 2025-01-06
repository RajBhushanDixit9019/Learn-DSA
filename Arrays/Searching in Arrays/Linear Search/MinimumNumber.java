// Find the minimum number in the given array

// Algorithm: Steps to solve the problem.
// Step 1: Initialize the minimum value with the first element of the array
// Step 2: Traverse the array and update the minimum value if a smaller element is found
// Step 3: Return the minimum value

public class MinimumNumber {

    // Method to find the minimum number in the array
    public static int getMinimumNumber(int[] arr) {
        // Initialize the minimum value with the first element of the array
        int min = arr[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update the minimum value if a smaller element is found
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Return the minimum value
        return min;
    }

    public static void main(String[] args) {
        // Define an array with some values
        int[] arr = {2, 5, -7, 8, 1};

        // Call the method to get the minimum number in the array
        int min = getMinimumNumber(arr);

        // Print the minimum number in the array
        System.out.println("Minimum number in the array is " + min);
    }
}
