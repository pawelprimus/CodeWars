// Sum of Multiples
// 8kyu
// https://www.codewars.com/kata/57241e0f440cd279b5000829/train/javascript
// 2022-03-10 T:22:26:40

function sumMul(n, m) {
    if (m <= n) {
        return "INVALID";
    }

    let sum = 0;
    let loopNumber = 0;

    while (loopNumber < m) {
        sum += loopNumber;
        loopNumber = loopNumber + n;
    }
    return sum;
}

sumMul(3,13);