public class MostOccurringElement {

    // Divide and Conquer method to find the most frequently occurring element in an array
    public static Integer findMostOccurring(int [] arr){
        // Base Cases
        if(arr.length == 0) return null;
        if(arr.length == 1) return arr[0];

        // divide
        int mid = arr.length/2;
        int [] left = Arrays.copyOfRange(arr, 0, mid);
        int [] right = Arrays.copyOfRange(arr, mid, arr.length);

        // conquer, recursively find the most occuring element in left and right half
        Integer leftMost = findMostOccurring(left);
        Integer rightMost = findMostOccurring(right);

        // combine, count occurences of elements in left and right half
        int leftCount = countOccurences(left, leftMost);
        int rightCount = countOccurences(right, rightMost);

        return leftCount>= rightCount ? leftMost: rightMost;

    }
    // helper method to count the occurences
    private static int countOccurences(int [] arr, Integer value){
        if (value == null) return 0;
        int count = 0;
        for(int num: arr){
            if (num == value){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] myArr = {5,8,4,-9,-0,5,12,3};
        Integer result = findMostOccurring(myArr);

        System.out.println(result);

    }
}
