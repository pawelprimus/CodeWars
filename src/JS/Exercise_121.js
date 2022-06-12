
// Digitize
// 7 kyu
// https://www.codewars.com/kata/5417423f9e2e6c2f040002ae/train/javascript
// 2022-06-12 T:13:43:53

function digitize(n) {
    return Array.from(String(n))
        .map(i => Number(i))
}

console.log(digitize(123124))