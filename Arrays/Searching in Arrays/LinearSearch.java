

public class LinearSearch {
    
    // method to perform the linear search on array to find the element..
    public static int linearSearch(int[] arr, int target){
        int loc=-1, i;
        
        for(i=0;i<arr.length;i++){
            if(target == arr[i]){
                loc=i;
            }
        }

        return loc;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 4;
        int loc=linearSearch(arr,target);

        if(loc!=-1){
            System.out.println("Element "+target+" located at "+loc+"th posission in Array");
        }
        else{
            System.out.println("Element "+target+" is not located in the Array");
        }
    }
}