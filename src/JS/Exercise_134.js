
// Sum even numbers
// 7 kyu
// https://www.codewars.com/kata/586beb5ba44cfc44ed0006c3/train/javascript
// 2022-06-15 T:08:03:06

function sumEvenNumbers(input) {
    return input.filter(x => x % 2 === 0).reduce((sum, num) => sum + num, 0)
}
