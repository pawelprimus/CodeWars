// Evens and Odds
// 7 kyu
// https://www.codewars.com/kata/583ade15666df5a64e000058/train/javascript
// 2022-06-20 T:20:13:12

function evensAndOdds(num) {
    return num % 2 === 0 ? num.toString(2) : num.toString(16).toLowerCase();
}