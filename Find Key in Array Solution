public class findKey {

    // given a key, returns the index of a key in the array

    public static int findKey(int key, int [] array){
        for (int i = 0; i < array.length; i++){
            if (key == array[i]) return i;
        }
        return -1;
    }


    // returns an array that has the indexes of all keys
    public static int[] findAllKeys(int key, int [] array){
        // create new array that will hold the indexes of the keys
        int [] keyArray = new int [array.length];
        int j = 0;

        for(int i= 0; i < array.length; i++){
            if(key == array [i]){
                keyArray[j++] = i;
            }
        }
        // If j is greater than 0, returns a trimmed copy of the array (up to j elements)
        // If j is less than 0 (no key found), returns null
        return j > 0 ? java.util.Arrays.copyOf(keyArray, j) : null;
    }

    public static void main(String[] args) {
        int key = 4;
        int [] myArray = {1,2,3,4,5,6,7,8,9};

        System.out.println(findKey(4,myArray));


        int [] myArr = {2,3,4,4,6,7,8,9,4,2,4,4,2};

        System.out.println(Arrays.toString(findAllKeys(key, myArr)));
    }
}
