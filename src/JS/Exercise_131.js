
// Difference Of Squares
// 7kyu
// https://www.codewars.com/kata/558f9f51e85b46e9fa000025/train/javascript
// 2022-06-15 T:07:33:53

function differenceOfSquares(n){
    var sum = Array.from(Array(n + 1).keys()).reduce((sum, num) => sum + num, 0);
    var squares = Array.from(Array(n + 1).keys()).map(x => Math.pow(x,2)).reduce((sum, num) => sum + num, 0);
    return Math.pow(sum,2) - squares
}

console.log(differenceOfSquares(10))