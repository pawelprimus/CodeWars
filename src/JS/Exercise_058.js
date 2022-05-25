
// Array plus array
// 8kyu
// https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/javascript
// 2022-05-24 T:21:48:25

function arrayPlusArray(arr1, arr2) {
    return arr1.reduce((sum, a) => sum + a , 0) + arr2.reduce((sum, a) => sum + a , 0); //something went wrong
}

console.log(arrayPlusArray([1, 2, 3], [4, 5, 6]))