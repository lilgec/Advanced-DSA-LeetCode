public class SubArray {

    public static int[] longestIncSub(int[] arr, int left, int right) {
        // Base Cases
        if (right < left) return new int [] {-1,-1}; // Invalid array
        if (right - left == 0) return new int [] {left,left}; // Array w/ one element
        if (right - left == 1){ // Array w/ two elements
            if(arr[left] < arr[right]) return new int [] {left, right};
            return new int [] {-1,-1};
        }

        // Divide the array, recursively find longestIncSub on both halves
        int mid = (right+left) /2;
        int [] leftResult = longestIncSub(arr, 0, mid);
        int [] rightResult = longestIncSub(arr, mid+1, arr.length-1);
        // Find the longest increasing sub array that crosses the midpoint
        int [] crossResult = findSolRL(arr, mid);

        // Conquer step, find the length of each sub array, return the longest subarray
        int leftLength = leftResult[1] - leftResult[0];
        int rightLength = rightResult [1] - rightResult[0];
        int crossLength = crossResult[1] - crossResult[0];

        // Compare the length of each result, returning the longest sub array
        if (leftLength >= rightLength && leftLength >= crossLength) {
            return leftResult;
        } else if (rightLength >= leftLength && rightLength >= crossLength) {
            return rightResult;
        } else {
            return crossResult;
        }
    }

    // Helper method to find the longest increasing subarray across midpoint
    private static int [] findSolRL(int [] arr, int mid){
        int s = mid;
        int t = mid;

        // Find start indx. Start from mid and move left while values are decreasing
        for (; s > 0 && arr[s] > arr[s - 1]; s--) {
        }

        // Find end indx. Start from mid and move right while values are increasing
        for (; t < arr.length - 1 && arr[t] < arr[t + 1]; t++) {
        }

        return new int[]{s, t};
    }

    public static void main(String[] args) {
        int [] myArr = {3,-1,0,4,5,7,9,6};
        int [] result = longestIncSub(myArr, 0, myArr.length-1);
        System.out.println(Arrays.toString(result));
    }
}
