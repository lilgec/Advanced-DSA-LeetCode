public class arrayMax {

    // Using divide & conquer, find the maximum value of the array
    public static int findMax(int[] arr) {
        // Base cases
        if (arr.length == 1) return arr[0]; // Base case, if the array has only one element, return it (maxValue)
        // If there are two elements, return the max of the two
        if (arr.length == 2) return Math.max(arr[0], arr[1]);


        // Divide step: split the array into two halves
        int midIndex = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, midIndex); // First half
        int[] right = Arrays.copyOfRange(arr, midIndex, arr.length); // Second half

        // Recursively find the maximum in both halves
        int maxL = findMax(left); // Find the maximum in the left half
        int maxR = findMax(right); // Find the maximum in the right half

        // Conquer step: return the maximum of both halves
        return Math.max(maxL, maxR);
    }

    //Using divide and conquer, find the second maximum value in an array
    public static int findSecondMax(int [] arr){
        // Base case
        // If there are two elements, return the minimum of the two (second Max)
        if (arr.length == 2) return Math.min(arr[0], arr[1]);


        // Divide step: split the array into two halves
        int midIndex = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, midIndex); // First half
        int[] right = Arrays.copyOfRange(arr, midIndex, arr.length); // Second half

        // Recursively find the maximum in both halves
        int maxL = findMax(left); // Maximum in the left half
        int maxR = findMax(right); // Maximum in the right half

        // Conquer step: find the second max
        if(maxL > maxR){
            return Math.max(findSecondMax(left),maxR);
        }else{
            return Math.max(findSecondMax(right),maxL);
        }
    }

    public static void main(String[] args) {
        int [] myArray= {3, -7, 25, -4, 6, 8, 10};
        //finds max of myarray
        System.out.println(findMax(myArray)); //25
        // finds second max of myarray
        System.out.println(findSecondMax(myArray)); //10
    }
}
