// Narcissistic Numbers
// 7kyu
// https://www.codewars.com/kata/56b22765e1007b79f2000079/train/javascript
// 2022-06-29 T:08:40:34

function isNarcissistic(n) {
    return String(n).split("")
        .map(i => Math.pow(i, String(n).length))
        .reduce((num, sum) => num + sum, 0) === n
}

isNarcissistic(153)