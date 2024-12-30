// Remove the duplicate elements from the array..

// Step 1: sort the array and create unique array

//Step 2: compare the each element with its next element in array
//store if it not duplicate or else move to next element

import java.util.Arrays;

public class IsArrayDuplicate {
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
    public static void main(String[] args) {
        // array..
        int[] arr={1,1,1,1,1};

        // get unique array elements
        int[] uniq = getUniqueArray(arr);

        // output:
        System.out.println("Array after removing the duplicate elements..");
        for(int ele:uniq){
            System.out.print(ele+" ");
        }
    }
}
