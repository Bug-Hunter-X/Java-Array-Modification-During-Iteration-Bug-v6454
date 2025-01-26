public class UncommonBugSolution {

    public static void main(String[] args) {
        int[] arr = new int[5];

        // Assign values to the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Correct way to iterate and modify array elements. Using a copy of array to avoid side effects.
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = arrCopy[i] * 2; 
        }

        // Print the original and modified array elements
        System.out.println("Original array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Modified array elements:");
        for (int num : arrCopy) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}