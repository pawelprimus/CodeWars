
// Sum of positive
// 8kyu
// https://www.codewars.com/kata/5715eaedb436cf5606000381/train/javascript
// 2022-05-19 T:21:04:25
function positiveSum(arr) {
    return arr.filter(i => i > 0).reduce((partialSum, a) => partialSum + a, 0)
}

console.log(positiveSum([1, -2, 3, 4, 5]))