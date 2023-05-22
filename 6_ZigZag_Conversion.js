function convert(s,noRows){
    let i = 0 
    let flag = false
    let ans = new Array(noRows).fill('')
    for(let k = 0 ; k < s.length ; k++){
        let ch = s[k]
        ans[i] = ans[i] + ch
        if(i === 0 || i === noRows-1){
            flag = !flag
        }
        if(flag === true){
            i = i + 1 
        }else{
            i = i - 1 
        }
    }
    let zigzag = ''
    for(let j = 0 ; j < ans.length ; j++){
        zigzag = zigzag + ans[j]
    }
    return zigzag
}
s = "PAYPALISHIRING", noRows = 5
console.log(convert(s,noRows))
