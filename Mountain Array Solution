public class MountainArray {

    // create a method to determine if an array is a mountain array

    // mountain array: [3,5,7,11,19,12,6,4,1]
    // Values are steadily increasing until it reaches a peak, values after the peak are steadily decreasing

    public static boolean findMountainArray (int arr[]){
        int n = arr.length, i=0;

        // for loop moves through the array to the peak if its increasing
        // loop runs from the start of the array to the end only if the next value is greater than the current value
        // loop will end at peak (largest value), i= peak

        for (; i < n-1 && arr[i]  < arr[i+1]; i++);

        // return false if peak is at beginning or end of the array --> not a mountain
        if (i <= 0 || i == n-1) return false;

        //for loop moves from the peak to the end of the array to check if values are decreasing
        for (; i < n - 1 && arr[i] > arr[i + 1]; i++);

        // Check if reached the end --> returns true
        return i == n - 1;
    }

    public static void main(String[] args) {
        int [] myArray = {3,5,7,11,19,12,6,4,1};

        System.out.println(findMountainArray(myArray));
    }
}
