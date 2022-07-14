// Every possible sum of two digits
// 7kyu
// https://www.codewars.com/kata/5b4e474305f04bea11000148/train/javascript
// 2022-07-14 T:07:04:02

function digits(num){
    var numArr = String(num).split('').map(i => Number(i))
    var result = [];

    for (let i = 0; i < numArr.length; i++) {
        for (let j = i + 1; j < numArr.length; j++) {
            result.push(numArr[i] + numArr[j])
        }
    }
    return result;
}

console.log(digits(12345))