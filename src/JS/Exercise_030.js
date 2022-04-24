
// String cleaning
// 8kyu
// https://www.codewars.com/kata/57e1e61ba396b3727c000251/train/javascript
// 2022-04-20 T:23:39:02
function stringClean(s) {
    myString = s.replace(/\d/g, '');
    return myString;
}

console.log(stringClean('This looks5 grea8t!'))