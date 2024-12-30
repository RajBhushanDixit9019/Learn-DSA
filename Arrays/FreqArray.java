import java.util.Arrays;

public class FreqArray {

    public static int[] getUniqueArray(int[] arr) {
        // Sort the array to group duplicates together
        Arrays.sort(arr);

        // Create a temporary array to hold unique elements
        int[] temp = new int[arr.length];
        int index = 0;

        // Add the first element to the unique array
        temp[index++] = arr[0];

        // Traverse the sorted array and add only unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[index++] = arr[i];
            }
        }

        // Copy unique elements to a new array of the correct size
        int[] unique = new int[index];
        for (int i = 0; i < index; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    public static int[] getFrequencyArray(int[] uni, int[] arr) {
        // Frequency array calculation
        int[] freq = new int[uni.length];

        for (int i = 0; i < uni.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (uni[i] == arr[j]) {
                    freq[i]++;
                }
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 5, 5, 3, 2, 2};

        //Step 1: Getting the unique array
        int[] uni = getUniqueArray(arr);

        //Step 2: Getting the frequency of unique elements
        int[] freq = getFrequencyArray(uni, arr);

        // Output: Frequency of array elements
        System.out.println("Element -> Frequency");
        for (int i = 0; i < uni.length; i++) {
            System.out.println(uni[i] + " -> " + freq[i]);
        }
    }
}
