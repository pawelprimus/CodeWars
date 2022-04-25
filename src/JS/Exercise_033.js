// Sum of differences in array
// 8kyu
// https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/javascript
// 2022-04-24 T:19:15:05
function sumOfDifferences(arr) {

    var sortedArr = Array.from(arr).sort((a, b) => a - b).reverse();
    var result = 0;
    for (let i = 0; i < sortedArr.length - 1; i++) {
        result += (sortedArr[i] - sortedArr[i + 1]);
    }
    return result;
}

console.log(sumOfDifferences([2, 1, 10]));