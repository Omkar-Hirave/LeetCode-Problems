function fib(n){
    if(n === 1) return 1 
    let firstNumber = 0 
    let secondNumber = 1
    let nextNumber = 0
    for(let i = 2 ; i <= n ; i++){
        nextNumber = firstNumber + secondNumber
        firstNumber = secondNumber 
        secondNumber = nextNumber 
    }
    return nextNumber 
}