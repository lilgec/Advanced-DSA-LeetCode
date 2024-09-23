public class largestSubArrays {

    // finds the subarray with the greatest sum (sum of consecutive values from start to end of subarray)
    public static int [] largestSum(int [] arr){
        int n = arr.length;
        int start= 0;
        int end =0;
        int maxSum=Integer.MIN_VALUE;
        int currentSum;

        for(int s=0; s<n; s++){ // first loop to find start index
            currentSum=arr[s]; // reset current sum for the new subarray starting at s
            for(int t= s+1; t<n; t++){ // second loop to find the end index
                currentSum+= arr[t]; // consecutively add values from s to t
                if(currentSum>maxSum){
                    maxSum = currentSum;
                    start = s; // record start index
                    end = t; // record end index
                }
            }
        }
        return new int [] {start,end};
    }

    
    // finds the longest subarray which values are increasing
    public static int [] longestIncrease(int [] arr){
        int n = arr.length;
        int start =0;
        int end = 0;
        int maxLength =1;
        int currentLength= 1;
        int currentStart =0;

        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){ // checks to see if values are increasing, if so increase currentLength
                currentLength++;
            }else{
                currentStart=i; // if values are not increasing, reset currentStart to the current index & reset currentLength to 1
                currentLength=1;
            }
            if (currentLength>maxLength){ // check to see if currentLength is greater than maxLength
                maxLength=currentLength;
                start = currentStart; // if so, record the start index & end index
                end =i;
            }
        }
        return new int []{start,end};
    }

    // test
    public static void main(String[] args) {
        int [] myArray= {3, -7, 25, -4, 6, 8, 10};
        System.out.println(Arrays.toString(largestSum(myArray))); // returns [2,6]
        System.out.println(Arrays.toString(longestIncrease(myArray))); // returns [3,6]
    }
}
