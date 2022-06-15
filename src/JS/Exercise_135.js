
// Char Code Calculation
// 7kyu
// https://www.codewars.com/kata/57f75cc397d62fc93d000059/train/javascript
// 2022-06-15 T:08:15:39

function calc(x){
    var total1 = Array.from(x)
        .map(i => i.charCodeAt(0).toString())
        .reduce((sum, char) => sum + char)

    var total2 = total1.replace(/7/g, '1')


    return Array.from(String(total1)).map(Number).reduce((sum, num) => sum + num , 0)
        - Array.from(String(total2)).map(Number).reduce((sum, num) => sum + num , 0)
}

console.log(calc("abcdef"))