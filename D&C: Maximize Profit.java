public class StockMarket {
    // Given an array of integers, determine which days are the best to buy and sell to maximize profit
    // Return the buy and sell dates (indices)
    public static int [] maximizeProfit (int [] arr, int left, int right){
        // Base Cases
        if (right < left) return new int[]{-1, -1}; // Invalid range
        if (right == left) return new int[]{left, left}; // Single element -- if buy and sell date (indices) are the same
        if (right - left == 1) {
            // Two elements: return them sell price is greater than buy price
            if (arr[left] < arr[right]) return new int[]{left, right};
            return new int[]{-1, -1};
        }

        // Divide Step:
        int mid=(left + right)/2;
        int [] leftResult = maximizeProfit(arr,0, mid); // Recursively find maxProfit on left side
        int [] rightResult = maximizeProfit(arr, mid+1, right); // Recursively find maxProfit on rightSide
        int [] crossResult = findSolLR(arr, mid); // Find maxProfit across mid point

        // Conquer Step:
        // Calculate the profits
        int leftProfit = (leftResult[0] != -1) ? arr[leftResult[1]] - arr[leftResult[0]] : -1;
        int rightProfit = (rightResult[0] != -1) ? arr[rightResult[1]] - arr[rightResult[0]] : -1;
        int crossProfit = (crossResult[0] != -1) ? arr[crossResult[1]] - arr[crossResult[0]] : -1;

        // Return the result with the highest profit
        if (leftProfit >= rightProfit && leftProfit >= crossProfit) {
            return leftResult;
        } else if (rightProfit >= leftProfit && rightProfit >= crossProfit) {
            return rightResult;
        } else {
            return crossResult;
        }
    }
    // Helper method to find the buy and sell dates across the mid point
    private static int[] findSolLR(int[] arr, int mid) {
        int s = minIndex(arr, 0, mid);
        int t = maxIndex(arr, mid + 1, arr.length-1);

        return (s == mid && t == mid) ? new int[]{-1, -1} : new int[]{s, t};
    }

    // finds the buy date
    private static int minIndex(int[] arr, int start, int end) {
        int minIdx = start;
        for (int s = start + 1; s <= end; s++) {
            if (arr[s] < arr[minIdx]) {
                minIdx = s;
            }
        }
        return minIdx;
    }

    // finds the sell date
    private static int maxIndex(int[] arr, int start, int end) {
        int maxIdx = start;
        for (int t = start + 1; t <= end; t++) {
            if (arr[t] > arr[maxIdx]) {
                maxIdx = t;
            }
        }
        return maxIdx;
    }

    public static void main(String[] args) {
        int [] myArray = {14,3,2,1,3,8,27,2};
        System.out.println(Arrays.toString(maximizeProfit(myArray, 0, myArray.length-1)));
    }
}
