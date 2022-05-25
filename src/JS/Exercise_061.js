
// Count the Monkeys!
// 8kyu
// https://www.codewars.com/kata/56f69d9f9400f508fb000ba7/train/javascript
// 2022-05-24 T:21:57:30

function monkeyCount(n) {
    var arr = [];
    for (let i = 1; i <= n; i++) {
        arr.push(i)
    }
    return arr;
}
console.log(monkeyCount(10))