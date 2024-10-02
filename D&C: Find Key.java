public class findKey {

    public static int findKey(int [] arr, int key, int left, int right){
        //Base Case
        if (left > right) return -1;
        if (left == right) return arr[left] == key ? left : -1;

        // Divide
        int mid = left + (right-left) / 2;

        // Conquer
        // Check if key is at mid
        if (arr[mid] == key) return mid;

        // if not search left and right side for the key
        int leftResult = findKey(arr, key, left, mid - 1);
        int rightResult = findKey(arr, key, mid + 1, right);

        // return index if the key is found
        if (leftResult != -1) return leftResult;
        return rightResult;
    }

    public static void main(String[] args) {
        int [] myArray= {1,45,78,452,424,94};
        int [] myArray1 = {64,13,62,14,51};
        int key = 78;

        int result1 = findKey(myArray, key, 0, myArray.length-1);
        int result2 = findKey(myArray1, key, 0, myArray1.length-1);

        System.out.println(result1);
        System.out.println(result2);
    }
}
