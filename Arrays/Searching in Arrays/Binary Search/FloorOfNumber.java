// Floor of a number is a number hwich is smoller or equal to the target number..

// Example : arr={2,3,5,8,14,16,18}
// target = 4
// output : 3

// Implementation..
public class FloorOfNumber {
    // Algorithm to find the ceiling of a number in a sorted array
    public static int searchFloorNumber(int[] arr, int target) {
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
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 4;

        int floorNumber = searchFloorNumber(arr, target);

        if (floorNumber != -1) {
            System.out.println("Floor Number: " + floorNumber); // Output: 16
        } else {
            System.out.println("No Floor number found.");
        }
    }
}
