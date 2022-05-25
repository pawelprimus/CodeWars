// Can we divide it?
// 8kyu
// https://www.codewars.com/kata/5a2b703dc5e2845c0900005a/train/javascript
// 2022-05-25 T:21:44:37
function isDivideBy(number, a, b) {
    return (number % a === 0 && number % b === 0)
}

console.log(isDivideBy(-12, 2,-6))