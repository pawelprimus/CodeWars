
// Find the middle element
// 7 kyu
// https://www.codewars.com/kata/545a4c5a61aa4c6916000755/train/javascript
// 2022-06-10 T:07:56:20

function gimme(triplet) {
    copyArr = [...triplet].sort(((a, b) => a-b))

    var middle = copyArr[1]
    return triplet.indexOf(middle)
}

console.log(gimme([-5.2, -10.6, 14]))
console.log(gimme([2, 3, 1]))
console.log(gimme([5, 10, 14]))