
// Generate range of integers
// 8kyu
// https://www.codewars.com/kata/55eca815d0d20962e1000106/train/javascript
// 2022-05-25 T:21:50:28

function generateRange(min, max, step) {
    var arr = [];

    for (let i = min; i <= max; i += step) {
        arr.push(i);
    }
    return arr;
}