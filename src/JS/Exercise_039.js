
// Double Char
// 8kyu
// https://www.codewars.com/kata/56b1f01c247c01db92000076/train/javascript
// 2022-04-27 T:19:53:35
function doubleChar(str) {
    return Array.from(str).map(function (x) {return x + x}).join("");
}

console.log(doubleChar("abcd"));


