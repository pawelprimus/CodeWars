
// Simple remove duplicates
// 7 kyu
// https://www.codewars.com/kata/5ba38ba180824a86850000f7/train/javascript
// 2022-06-14 T:08:03:11

function solve(arr) {
    var uniqueSet = new Set(arr.reverse())
    return Array.from(uniqueSet).reverse();
}


console.log(solve([3,4,4,3,6,3]))

/*function solve(arr){
    return arr.filter((val,i) => arr.lastIndexOf(val) == i);
}*/