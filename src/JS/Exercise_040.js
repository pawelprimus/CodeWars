
// Square(n) Sum
// 8kyu
// https://www.codewars.com/kata/515e271a311df0350d00000f/train/javascript
// 2022-04-27 T:20:01:00
function squareSum(numbers) {
    return numbers.map(i => i * i).reduce((a, b) => a + b, 0);
}

console.log(squareSum([0, 3, 4, 5]));