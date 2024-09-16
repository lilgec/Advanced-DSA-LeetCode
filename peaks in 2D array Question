public class main {

        // A method that finds peaks in 2d array & returns all peaks as an array of strings
        // A peak is when the values in the rows and columns are steadily decreasing to a lowest point (peak) and then steadily increasing after that value
    
        public static String [] find2Dpeaks(int [][] arr){
            int rows = arr.length;
            int columns = arr[0].length;

            // new array to hold peaks as a string
            String[] peakArray = new String[rows + columns];
            int peaks =0;

            for(int i = 1; i<rows-1; i++){
                for (int j = 1; j<columns-1; j++){

                    if (arr[i][j] < arr[i-1][j] && // less than top neighbor
                            arr[i][j] < arr[i+1][j] && // less than bottom neighbor
                            arr[i][j] < arr[i][j-1] && // less than left neighbor
                            arr[i][j] < arr[i][j+1]) { // less than right neighbor
                        // add peak as a string to new array
                        peakArray[peaks] = "[" + i + "," + j + "]";
                        peaks++;
                    }
                }
            }
            // returns the new array, as long as the array has elements
            return peaks > 0 ? java.util.Arrays.copyOf(peakArray, peaks) : null;
        }

    public static void main(String[] args) {
            // test
        int [][] my2dArray = {
                {2, 7, 9, 10, 11},
                {4, 6, 5, 8, 8},
                {8, 4, -2, 6, 9},
                {13, 8, 4, -7, 12},
                {2, -1, 5, -3, 10},
                {1, 6, 7, 2, 4}
        };
        System.out.println(Arrays.toString(find2Dpeaks(my2dArray)));
        }
}
