
// Convert number to reversed array of digits
// 8kyu
// https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/javascript
// 2022-04-13 T:20:07:44

function digitize(n) {
    return Array.from(n.toString()).reverse().map(Number);
}

console.log(digitize(12345))