import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declaration and Initialization
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements using index
        System.out.println("First element: " + numbers[0]); // Output: 10
        System.out.println("Last element: " + numbers[numbers.length - 1]); // Output: 50

        // Traversing the array
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

       

        

        // usig  for-each loop to itarate the array 
        System.out.println("Array itaration uisng for-each loop:\n");
        for(int num: numbers){
            System.out.println(num);
        }

         // Input in array using loops
         int[] std = new int[5];

         System.out.println("Enter 5 integers for the array:");
         for (int i = 0; i < std.length; i++) {
             while (true) { // Loop until valid input is provided
                 System.out.print("Enter element " + (i + 1) + ": ");
                 if (in.hasNextInt()) {
                     std[i] = in.nextInt();
                     break; // Exit the loop for this element
                 } else {
                     System.out.println("Invalid input. Please enter an integer.");
                     in.next(); // Clear the invalid input
                 }
             }
         }
 
         // Display the array elements
         System.out.println("Array elements you entered:");
         for (int i = 0; i < std.length; i++) {
             System.out.println("Element at index " + i + " is " + std[i]);
         }

         in.close(); // Close the scanner to avoid resource leaks
    }
}
