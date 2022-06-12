
// Sum of a sequence
// 7 kyu
// https://www.codewars.com/kata/586f6741c66d18c22800010a/train/javascript
// 2022-06-10 T:08:18:01

const sequenceSum = (begin, end, step) => {
    var sum = 0;
    for (let i = begin; i <= end; i += step) {
        sum +=i
    }
    return sum
};

console.log(sequenceSum(2,6,2))