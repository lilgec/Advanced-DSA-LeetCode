package inClassProblems.BruteForce.PairofElementSum;

import java.util.Arrays;

public class pairOfElements {

    //using brute force, create an algorithm to find all pairs of elements in an array that sum to a specific target value

    public static String [] sumOfPairs(int sum, int []arr){
        int n = arr.length;

        String [] sumOfPairs = new String[n * (n - 1) / 2];
        int indx =0;

        for(int i=0; i<n-1; i++){
            for(int j =i; j<n; j++){ // starts from i to avoid duplicates
                if(arr[i]+arr[j] == sum){
                    sumOfPairs [indx] = "[" + i + "," + j + "]";
                    indx++;
                }
            }
        }
        return indx>0 ? Arrays.copyOf(sumOfPairs, indx): null;
    }

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,1,3,2,1,4,5};
        int sum = 5;

        System.out.println(
                "The sum of the the values at these indices equals " + sum +": "
                + Arrays.toString(sumOfPairs(sum, myArray))
        );
    }
}
