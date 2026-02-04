import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // bubble sort is algorithms that sorts an array from the lowest value to highest value
        // how it works
        // 1. Go through the array, one value at a time
        // 2. For each value, compare the value with the next value
        // 3. if the value is higher than the next one, swap the values so that the highest
        // value comes last.
        // 4. Go through the array as many times as there are values in the array.
        //implement bubble sort
        // 1. An array with values to sort
        // 2. An inner loop that goes through the array and swaps value if the first value is higher
        // than the next value. This loop must loop through one less value each time it runs
        // 3. An outer loop that controls how many time the inner loop must run. For an array with n
        // value, this outer loop must run n - 1 times.
        int arr[] = {3, 2, 5, 6, 4, 3, 2, 1};
        System.out.println("Array chua duoc sap xep: " );
        for (int x : arr){
            System.out.print(x + " ");
        }
        bubbleSort(arr);
        System.out.println();
        System.out.println("Array da duoc sap xep: ");
        for (int x : arr){
            System.out.print(x + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j ++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
