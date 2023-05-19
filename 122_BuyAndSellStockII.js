function BuyAndSellStocks(prices){
    let profit = 0 
    for(let i = 1 ; i < prices.length ;i++){
        if(prices[i] > prices[i-1]){
        profit = profit + (prices[i] - prices[i-1])
    }
}
    return profit
}
prices = [7,1,5,3,2,2,6,4]
console.log(BuyAndSellStocks(prices))