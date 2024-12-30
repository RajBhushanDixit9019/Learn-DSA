// Reversing the array
public class RevArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = new int[arr.length];

        System.out.println("Reversed Array:");

        // Reverse the array
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }

        // Print the reversed array
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
