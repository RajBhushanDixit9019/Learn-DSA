public class SumOfArray {
    public static int sumOfArray(int[] arr){
            
            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum=sum+arr[i];
            }
            return sum;
        }
    
        public static void main(String[] args){
            int[] arr = {1,2,4};
    
            int res =sumOfArray(arr);

            System.out.println("Sum of Array:"+res);
           
    }
}
