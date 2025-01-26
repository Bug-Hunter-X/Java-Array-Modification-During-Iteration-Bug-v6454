public class UncommonBug {

    public static void main(String[] args) {
        int[] arr = new int[5];

        // Assign values to the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Print the array elements using a for-each loop
        System.out.println("Array elements (for-each loop):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Incorrect way to iterate and modify array elements (potential bug)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2; // modifying the array during iteration
        }

        // Print the modified array elements using a traditional for loop
        System.out.println("Modified array elements (traditional for loop):

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}