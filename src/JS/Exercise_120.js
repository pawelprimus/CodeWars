
// Sum of Minimums
// 7 kyu
// https://www.codewars.com/kata/5d5ee4c35162d9001af7d699/train/javascript
// 2022-06-12 T:13:38:17

function sumOfMinimums(arr) {

    var sum = 0;
    for (let i = 0; i < arr.length; i++) {

        sum += min(arr[i])
    }

    return sum;
}

var min = function (list) {
    return Math.min(...list);
}

sumOfMinimums([[11, 12, 14, 54], [67, 89, 90, 56], [7, 9, 4, 3], [9, 8, 6, 7]])