public class Main {

    // Given an array of values that represent the price of a stock, create a method that determines the best dates to buy and sell (makes the most profit)
    // The indexes of the array represent the date
    // return the date to buy and sell

    public static int [] maximizeProfit (int [] arr){
        int dateBuy = 0;
        int dateSell = 0;
        int profit =0;
        int n = arr.length;

        for(int buy =0; buy < n; buy++ ){
            for(int sell = buy+1; sell < n; sell++){
                if(arr[sell] - arr[buy] > profit){
                    profit = arr[sell] - arr[buy];
                    dateBuy = buy;
                    dateSell = sell;
                }
            }
        }
        return new int []{dateBuy, dateSell};
    }

    public static void main(String[] args) {
        //test
        int [] myArray = {14,3,2,1,3,8,27,2};

        System.out.println(Arrays.toString(maximizeProfit(myArray)));
        // should return (3,6)
    }
}
