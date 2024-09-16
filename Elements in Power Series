public class ElementsInExpSeries {

    // Both methods print the number of elements in an exponential series from the first value to n
    // Both methods produce the same result

    public static int numElementsInExpSeries(int n, int first, int power){
        int counter = 0;

        for(int i = first; i <= n; i*=power){
            counter +=1;
        }
        return counter;
    }


    // Following method produces the same result as the above method
    public static int numElementsInExpSeries1(int n, int first, int power){
        // logb(x) = log(x)/log(b)
        return (int) (Math.log(n/first)/ Math.log(power) +1);
    }

    public static void main(String[] args) {
        // test

        int n = 16;
        int first = 2;
        int power = 2;

        System.out.println("# of elements in the exp. series from " + first + " to " + n + ": ");
        System.out.println(numElementsInExpSeries(n,first, power));
        System.out.println(numElementsInExpSeries1(n, first, power));

    }
}
