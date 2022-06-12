
// Summing a number's digits
// 7 kyu
// https://www.codewars.com/kata/52f3149496de55aded000410/train/javascript
// 2022-06-12 T:11:35:31

function sumDigits(number) {
    return Array.from(String(Math.abs(number)))
        .map(char => Number(char))
        .reduce((sum , num) => sum + num,0)
}

console.log(sumDigits(-1568))