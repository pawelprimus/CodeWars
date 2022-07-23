// Check for prime numbers
// 7kyu
// https://www.codewars.com/kata/53daa9e5af55c184db00025f/train/javascript
// 2022-07-23 T:11:38:42

function isPrime(n) {
    if (n < 2) {
        return false;
    }
    if (n === 2) {
        return true;
    }
    if (n % 2 === 0) {
        return false
    }

    for (let i = 3; i < n; i = i + 2) {
        if (n % i === 0) {
            return false;
        }
    }
    return true;
}