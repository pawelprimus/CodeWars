// Even numbers in an array
// 7kyu
// https://www.codewars.com/kata/5a431c0de1ce0ec33a00000c/train/javascript
// 2022-06-29 T:08:22:40

function evenNumbers(array, number) {
    var evenArr = array.filter(i => i % 2 === 0)
    return evenArr.slice(evenArr.length - number);
}

console.log(
    evenNumbers([1, 2, 3, 4, 5, 6, 7, 8, 9], 3))