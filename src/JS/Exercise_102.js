
// Sum of two lowest positive integers
// 7 kyu
// https://www.codewars.com/kata/558fc85d8fd1938afb000014/train/javascript
// 2022-06-07 T:07:39:12

function sumTwoSmallestNumbers(numbers) {
    numbers.sort((a, b) => a - b)
    return numbers[0] + numbers[1];
}
console.log(sumTwoSmallestNumbers([15, 28, 4, 2, 43]))