public class PracticeProblem {

    // Given a positive integer n, count how many powers of 3 that are less than or equal to n


    // Method uses a counter and a for loop to determine the number of elements in the series
    public static int elementsInExpSeries(int n){
        int counter = 0;
        for(int i = 1; i<= n; i *=3){
            counter +=1;
        }
        return counter;
    }


    // does everything in one line of code --> returns the solution for the equation of the number of elements in an exp. series
    public static int elementsInExpSeries1(int n){
        return (int)((Math.log(n)/Math.log(3)) + 1);
    }

    public static void main(String[] args) {

        int n = 100;
        System.out.println("# of elements in the series from 1 to " +n +":");
        System.out.println(elementsInExpSeries1(n));
    }
}
