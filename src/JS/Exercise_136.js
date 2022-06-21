// Return the closest number multiple of 10
// 7 kyu
// https://www.codewars.com/kata/58249d08b81f70a2fc0001a4/train/javascript
// 2022-06-20 T:20:10:42

const closestMultiple10 = num => {
    return num % 10 < 5 ?
        num - num % 10
        : num + (10 - num % 10)
        ;
};