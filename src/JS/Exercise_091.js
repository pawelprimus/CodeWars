
// Find numbers which are divisible by given number
// 8 kyu
// https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/javascript
// 2022-06-02 T:20:03:53

function divisibleBy(numbers, divisor) {
    return numbers.filter(i => i % divisor === 0).toArray()
}