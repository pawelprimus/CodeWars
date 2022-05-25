
// Count by X
// 8kyu
// https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/javascript
// 2022-05-24 T:22:02:11

function countBy(x, n) {
    let arr = [];
    arr.push(x)
    for (let i = 0; i < n - 1; i++) {
        arr.push(x + arr[i])
    }
    return arr;
}

console.log(countBy(1, 10))