// Pairs of integers from m to n
// 7kyu
// https://www.codewars.com/kata/588e2a1ad1140d31cb00008c/train/javascript
// 2022-08-10 T:07:47:42

function generatePairs(m, n) {
    var resultArray = [];
    for (let i = m; i <= n; i++) {
        for (let j = i; j <= n; j++) {
            resultArray.push([i, j]);
        }
    }
    return resultArray;
}

console.log(generatePairs(2, 4));