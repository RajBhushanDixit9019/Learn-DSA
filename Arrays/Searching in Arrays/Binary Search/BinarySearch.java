// Binary search technique algorithm implimentation..

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;


        while(start <= end){

            // for larger number this may exceeds the int range
            // int mid = (start+end)/2;
            int mid = start + (end-start)/2; // solution

            // if element found..
            if(arr[mid] == target){
                return mid;
            }
            // move left side
            else if(target < arr[mid]){
                end = mid-1;
            }
            // move  right side
            else{
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10; // location is 9
        int index = binarySearch(arr, target);

        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+index+" th location");
        }

    }
}
