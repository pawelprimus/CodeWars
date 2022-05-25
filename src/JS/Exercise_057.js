
// Get the mean of an array
// 8kyu
// https://www.codewars.com/kata/563e320cee5dddcf77000158/train/javascript
// 2022-05-24 T:21:43:54
function getAverage(marks){
    return Math.floor(marks.reduce((a,b) => a + b, 0) / marks.length)
}

console.log(getAverage([1,2,3,4,5]))