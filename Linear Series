public class ElementsInLinearSeries {
    
    // Methods to determine the number of elements in a linear series
    // Both methods produce same result

    public static int elementsInLinearSeries(int n, int first, int difference){
        int counter = 0;
        for(int i = first; i <= n; i+=difference){
            counter+=1;
        }
        return counter;
    }

    // following method produces the same result as the above method:
    public static int elementsInLinearSeries1(int n, int first, int difference){
        return ((n-first)/difference) +1;
    }


    public static void main(String[] args) {
        // test

        int n = 17;
        int first = 2;
        int difference = 5;

        System.out.println("# of elements in linear series from " +first + " to " +n+ ":");
        System.out.println(elementsInLinearSeries(n,first,difference));
        System.out.println(elementsInLinearSeries1(n,first,difference));
    }
}
