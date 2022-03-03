// Find Maximum and Minimum Values of a List
// 7kyu
// https://www.codewars.com/kata/577a98a6ae28071780000989/train/javascript
// 2022-03-03 T:00:00:32

var min = function (list) {
    return Math.min(...list);
}

var max = function (list) {
    return Math.max(...list);
}

console.log(max([-52, 56, 30, 29, -54, 0, -110]));
