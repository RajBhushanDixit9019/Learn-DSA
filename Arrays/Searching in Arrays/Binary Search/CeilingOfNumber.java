// Ceiling of a number is a number which is grater or equal to target number..
// Applying the binary search algorithm to solve this problem..

// example: arr = [2,3,4,5,9,14,16,18]
// target = 15
// output = 16

// implementation..
public class CeilingOfNumber {

    // Algorithm to find the ceiling of a number in a sorted array
    public static int searchCeilingNumber(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ceilingNumber = -1; // Initialize to -1 to indicate no ceiling found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
               return arr[mid]; // Target is the ceiling
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ceilingNumber = arr[mid];
                end = mid - 1;
            }
        }
      return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 9, 14,16,17, 18,29};
        int target = 15;

        int ceilingNumber = searchCeilingNumber(arr, target);

        if (ceilingNumber != -1) {
            System.out.println("Ceiling Number: " + ceilingNumber); // Output: 16
        } else {
            System.out.println("No ceiling number found.");
        }
    }
}
