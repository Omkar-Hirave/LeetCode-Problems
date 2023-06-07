function isIsomorphic(s,t){
    const map = new Map()
    for(let i = 0 ; i < s.length ; i++){
        const charS = s[i]
        const charT = t[i]
        if(map.has(charS)){
            if(map.get(charS) !== charT){
                return false
            }
        }
        else{
            for(let [key , value] of map){
                if(value === charT){
                    return false
                }
            }
            map.set(charS,charT)
        }
    }return true
}
s = "foo", t = "bar"
console.log(isIsomorphic(s,t));