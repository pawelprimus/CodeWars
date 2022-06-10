
// Sort array by string length
// 7 kyu
// https://www.codewars.com/kata/57ea5b0b75ae11d1e800006c/train/javascript
// 2022-06-10 T:07:50:26

function sortByLength (array) {
    return array.sort( (a,b) => a.length - b.length )
};