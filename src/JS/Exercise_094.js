
// repeatIt
// 8 kyu
// https://www.codewars.com/kata/557af9418895e44de7000053/train/javascript
// 2022-06-03 T:08:26:44

var repeatIt = function(str, n) {
    return typeof str === "string" ? str.repeat(n): "Not a string"
}

console.log( repeatIt(3 , 3) )