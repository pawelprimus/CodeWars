// Length and two values.
// 7kyu
// https://www.codewars.com/kata/62a611067274990047f431a8/train/javascript
// 2022-08-10 T:07:53:57

function alternate(n, firstValue, secondValue) {
    var result = [];
    for (let i = 0; i < n; i++) {
        if (i % 2 === 0) {
            result.push(firstValue);
        } else {
            result.push(secondValue);
        }
    }
    return result;
}

console.log(alternate(5, true, false))