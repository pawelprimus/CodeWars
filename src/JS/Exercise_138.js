// Sum of integers in string
// 7 kyu
// https://www.codewars.com/kata/598f76a44f613e0e0b000026/train/javascript
// 2022-06-20 T:20:18:23

function sumOfIntegersInString(s) {
    var numbers = s.replace(/[^0-9]+/g, ' ').split(' ');
    return numbers.map(i => Number(i)).reduce((sum, num) => sum + num, 0);
}

console.log(sumOfIntegersInString("The30quick20brown10f0x1203jumps914ov3r1349the102l4zy"))
console.log(sumOfIntegersInString("12.4"))