public class Main {

    // Given an array of values, a dip is when a smaller value is sandwiched between two larger values
    // This method returns the index of greatist dip of the array

    public static int findMaxDip(int [] array){
        int maxDipIndex = -1; // Var to store index of the largest dip
        int maxDipValue = Integer.MIN_VALUE; // Stores value of largest dip
        for (int i = 1; i < array.length-1; i++){
            int prev = array[i-1];
            int next = array[i+1];

            // if value at index i is less than the previous and next values
            // and the value at index i is greater than max dip
            if(prev > array[i] && next > array[i] && array[i] > maxDipValue){
                maxDipValue = array[i];
                maxDipIndex = i;
            }
        }
        return maxDipIndex;
    }


    public static void main(String[] args) {
        int [] myArray = {3,1,2,5,-4,6,9,8,12};
        System.out.println(findMaxDip(myArray));
        
    }
}
