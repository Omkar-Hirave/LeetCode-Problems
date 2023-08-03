class Solution {
    public int buyChoco(int[] prices, int money) {
       Arrays.sort(prices);
       int chocolate = money - (prices[0] + prices[01]);
       if(chocolate >= 0){
           return chocolate;
       }
       return money;
    }
}