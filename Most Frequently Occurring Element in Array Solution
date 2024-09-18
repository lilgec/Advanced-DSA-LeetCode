public class main {


    // using brute force, write an algorithm to count the number of occurances of a specific int in an array
    public static int countSpecificOccurance(int num, int [] arr){
        int n = arr.length;
        int counter = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == num) counter ++;
        }
        return counter;
    }

    // using brute force, write an algorithm to determine the value that occurs the most in an array
    public static int mostOccuring(int [] arr){
        int n = arr.length;

        Arrays.sort(arr); // sort the array

        // initialize variables to track elements and frequency
        int mostFrequent = arr[0];
        int currentElement = arr[0];
        int maxFrequency = 1;
        int currentFrequency = 1;

        for(int i = 0; i < n; i++){
            // if the current element (arr[i]) equals the currentElement, increment frequency
            if(arr[i] == currentElement){
                currentFrequency++;
            // if current element (arr[i]) does not equal currentElement, set currentElement to arr[i] & reset currentFrequency to 1
            }else{
                currentElement = arr[i];
                currentFrequency =1;
            }
            // if currentFrequency is greater than maxFrequency, set max to currentFrequency, set mostFrequent to currentElement
            if(currentFrequency> maxFrequency){
                maxFrequency = currentFrequency;
                mostFrequent = currentElement;
            }
        }
        return mostFrequent;
    }


    public static void main(String[] args) {
        int [] myArray = {4,2,7,1,1,7,8,9,10,1,6,8,6,1,7,7,7,7,7,7};
        System.out.println("The number 1 occurs " + countSpecificOccurance(1,myArray) + " time(s)"); // prints 4 (1 occurs 4 times)
        System.out.println("The highest occuring element in the array is: " + mostOccuring(myArray)); // prints 7 (most occuring)
    }
}
