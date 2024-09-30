public class MinMax {

    // Using brute force, create an algorirthm to return the maximum value in the array
    public static int maxValue(int [] arr){
        int n = arr.length;
        int max = arr[0];

        for(int i = 0; i < n; i++){
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    // using brute force, create an algorithm to return the minimum value in the array
    public static int minValue(int [] arr){
        int n = arr.length;
        int min = arr[0];

        for(int i= 0; i < n; i ++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    // using brute force & only a single for loop, return all indexes that have a maximum value
    public static int [] maxIndexes(int []arr){
        int n = arr.length;
        int max = arr[0];

        int [] maxIndices = new int [n];
        int j = 0;

        for (int i = 0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
                j=0;
            }
            if(arr[i] == max){
                maxIndices[j] = i;
                j++;
            }
        }
        return j>0 ? java.util.Arrays.copyOf(maxIndices,j): null;
    }

    // using brute force & only a single for loop, return all indexes that have a minimum value
    public static int[] minIndexes(int []arr){
        int n= arr.length;
        int min = arr[0];

        int [] minIndices = new int [n];
        int j = 0;

        for(int i = 0; i < n; i ++){
            if(arr[i] < min){
                min = arr[i];
                j=0;
            }
            if(arr[i] == min){
                minIndices[j] = i;
                j++;
            }
        }
        return j >0 ? java.util.Arrays.copyOf(minIndices, j): null;
    }

    public static void main(String[] args) {

        int [] myArr = {400,500,600,400,30,400,700,800,-100,-100,200,700};
        System.out.println("Max value: " + maxValue(myArr)); // prints 800
        System.out.println("Min value: " + minValue(myArr)); // prints - 100

        System.out.println("Maximum value found at: " + Arrays.toString(maxIndexes(myArr)) + " indices"); // max is 800, found at [7]
        System.out.println("Mininum value found at: " + Arrays.toString(minIndexes(myArr)) + " indices"); // min is -100, found at [8,9]
    }
}
