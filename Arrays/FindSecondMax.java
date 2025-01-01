// Find the second largest element in the array..

//Step 1: Sort the array in acending order

//Step 2: select the second element from the last of array


// Implementation..
import java.util.Arrays;

public class FindSecondMax {
    
    //  method to get the second largest element of array..
    public static int getSecondMax(int[] arr){
        Arrays.sort(arr);
        int secondMaxElement;

        secondMaxElement=arr[arr.length-2];

        return secondMaxElement;
    }

    // Main code..
    public static void main(String[] args) {
        int[] arr = {3,6,1,4}; // second largest element is 4..

        int secondMax=getSecondMax(arr);

        System.err.println("Second Largest element in array:"+secondMax);
    }
}
