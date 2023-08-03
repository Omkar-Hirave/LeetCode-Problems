class Solution {
    public int buyChoco(int[] prices, int money) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= smallest) {
                secondSmallest = smallest;
                smallest = prices[i];
            } else if (prices[i] <= secondSmallest && prices[i] >= smallest) {
                secondSmallest = prices[i];
            }
        }
        
        int chocolate = money - (smallest + secondSmallest);
        if (chocolate >= 0) {
            return chocolate;
        }
        return money;
    }
}
// class Solution {
//     public int buyChoco(int[] prices, int money) {
//        Arrays.sort(prices);
//        int chocolate = money - (prices[0] + prices[01]);
//        if(chocolate >= 0){
//            return chocolate;
//        }
//        return money;
//     }
// }
