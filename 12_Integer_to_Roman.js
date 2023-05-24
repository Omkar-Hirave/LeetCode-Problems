function intToRoman(nums){
    const values = [1000,900,500,400,100,90,50,40,10,9,5,4,1]
    const symbols = ['M','CM','D','CD','C','XC','L',"XC",'X','IX','V','IV','I']
    let result = ''
    for(let i = 0 ; i < values.length ; i++){
        while(nums >= values[i]){
            result = result + symbols[i]
            nums = nums - values[i]
        }
    }
    return result
}
nums   = 3
console.log(intToRoman(nums))