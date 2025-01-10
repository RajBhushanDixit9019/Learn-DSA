// find the smallest letter greater than traget letter..
// example:
// input: letters ={'c','f','j'} target = 'a'
// output: 'c'

public class SmallestLetter {
    public static char searchLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                start = mid + 1; // Move to the right half
            } else {
                end = mid - 1; // Move to the left half
            }
        }

        // The array is circular, so return the first element if `start` exceeds bounds
        return arr[start];
    }

    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'a';

        char smallestLetter = searchLetter(arr, target); // Output: 'c'

        System.out.println("Smallest Letter: " + smallestLetter);
    }
}
