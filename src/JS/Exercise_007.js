// Is the date today
// 8kyu
// https://www.codewars.com/kata/563c13853b07a8f17c000022/train/javascript
// 2022-03-04 T:01:32:45

function isToday(date) {
    var today = new Date();

    return today.getDate() === date.getDate() &&
        today.getMonth() === date.getMonth() &&
        today.getFullYear() === date.getFullYear();
}

