// Find the Maximum and Minimum Elements in an Array
// Input: An integer array.
// Output: The maximum and minimum elements in the array.

public class FindMinMax {
    public static void main(String[] args){
        int[] arr = {23, 67,34,66};
        int min=arr[0];
        int max=arr[arr.length-1];


        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Min:"+min+" Max:"+max);
    }
}
