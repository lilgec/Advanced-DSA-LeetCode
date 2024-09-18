public class maxValues {

    // given an array of integers, return the indexes of the maximum value
    // limited to using one for loop

    public static int [] findMaxValues(int [] arr){
        int max = arr[0];
        int n = arr.length;

        // create a new array the size of the given array
        int []maxIndxs = new int [n];
        int j = 0;

        for(int i = 0; i<n; i++){
            // If value at current index is greater than max index, set this value to max index & clear the new array (by setting it back to 0)
            if (arr[i]>max){
                max = arr[i];
                j =0;
            }
            if (arr[i] == max){
                maxIndxs[j] = i;
                j++;
            }
        }
        return j > 0 ? java.util.Arrays.copyOf(maxIndxs,j):null;
    }
        public static void main(String[] args) {
        //test
        int [] myArray = {240, 140, 300, 125, 240,300, 80, 700, 84, 600, 700};

        System.out.println(Arrays.toString(findMaxValues(myArray))); // should return (7,10)

    }
}
