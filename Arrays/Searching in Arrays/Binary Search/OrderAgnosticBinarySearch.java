// Implementing binary search technique for acending or decending order sorted array.
public class OrderAgnosticBinarySearch {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        // find the array is whether sorted in acending or decending order..
        boolean isAsc = arr[start] < arr[end];
        

        while (start <= end) {

            int mid = start + (end - start) / 2;


            // if element found..
            if (arr[mid] == target) {
                return mid;
            }
            // for acending sorted array
            if(isAsc) {
                if(target < arr[mid]){
                    end=mid-1;
                }
                else {
                    start = mid+1;
                }
            }
              // for decending sorted array
            else{
                // move left side
                 if (target > arr[mid]) {
                    end = mid - 1;
                }
                // move right side
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 1; // location is 9
        int index = search(arr, target);

        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+index+" th location");
        }

    }
}
