public class Array {

    // arrays is a data structure used to store multiple elements
    // arrays are used by many algorithms

    // algorithms: find the lowest value in an array
    // below is the algorithm to find the lowest number in an array
    // 1. create a variable 'minVal' and set it equal to the first value of the array
    // 2. Go through every element in the array
    // 3. if the current element has a lower value than 'minVal', update 'minVal' to this value
    // 4. after looking at all the elements in the array, the 'minVal' variable now contains the lowest value

    public static void main(String[] args) {
        int [] array = {2, 5, 6, 1, 4, 5, 6, 2};

        int minVal = findLowestElement (array);

        System.out.println(minVal);
    }

    private static int findLowestElement(int[] array) {
        int minVal = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minVal){
                minVal = array[i];
            }
        }

        return minVal;
    }
}
