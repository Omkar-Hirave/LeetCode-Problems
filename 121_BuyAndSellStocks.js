function BuyAndSellStocks(prices){
    let maxProfit = 0 
    let minPrice = prices[0]
    for(let i = 1 ; i < prices.length ; i++){
        const currentProfit = prices[i] - minPrice
        if(prices[i] < minPrice){
            minPrice = prices[i]
        }
        else if(currentProfit > maxProfit){
            maxProfit = currentProfit 
        }
    }
    return maxProfit
}
prices = [7,6,4,3,1]
console.log(BuyAndSellStocks(prices))