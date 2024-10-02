public class maxSumSubarray {

    public static int [] maxSubarray (int [] arr, int left, int right){
        //base cases:
        if(right < left) return new int [] {-1,-1};
        if(right == left) return new int [] {left,left};
        if(right-left ==1) return new int [] {left, right};


        // divide step
        int mid = (left + right) /2;
        int [] leftResult = maxSubarray(arr, left, mid);
        int [] rightResult = maxSubarray(arr, mid+1, right);
        // find result across midpoint
        int [] crossResult = findSolRL(arr, mid);

        // Conquer step
        int leftSum = findSum(arr, leftResult );
        int rightSum = findSum(arr, rightResult);
        int crossSum = findSum(arr, crossResult);

        // Return the result w/ the largest sum
        if (leftSum >= rightSum && leftSum >= crossSum){
            return leftResult;
        }else if (rightSum >= leftSum && rightSum >= crossSum){
            return rightResult;
        }else return crossResult;
    }

    // Helper method to find the start and end index across the midpoint
    private static int [] findSolRL(int [] arr, int mid){
        // find the start point
        int leftSum =0;
        int maxLeftSum =0;
        int leftIndex = mid;

        for(int s= mid; s>= 0; s--){
            leftSum+=arr[s];
            if(leftSum>maxLeftSum){
                maxLeftSum=leftSum;
                leftIndex=s;
            }
        }

        // find end point
        int rightSum =0;
        int maxRightSum =0;
        int rightIndex = mid;

        for(int t = mid; t< arr.length; t++){
            rightSum+=arr[t];
            if(rightSum>maxRightSum){
                maxRightSum= rightSum;
                rightIndex=t;
            }
        }
        return new int [] {leftIndex, rightIndex};
    }

    // helper method to calculate the sum
    private static int findSum(int [] arr, int [] indx){
        int sum =0;
        int s = indx[0];
        int t= indx[1];
        for(int i = s; i<=t; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] myArray= {3, -7, 25, -4, 6, 8, 10};
        int [] result = maxSubarray(myArray, 0, myArray.length-1);
        System.out.println(Arrays.toString(result));
    }
}
