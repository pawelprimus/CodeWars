// Squares sequence
// 7kyu
// https://www.codewars.com/kata/5546180ca783b6d2d5000062/train/javascript
// 2022-06-29 T:08:29:22

function squares(x, n) {
    var result = [];

    if (n <= 0) {
        return result;
    }

    result.push(x);

    for (let i = 1; i < n; i++) {
        result.push(result[i - 1] * result[i - 1])
    }
    return result;
}

console.log(squares(2, 5))