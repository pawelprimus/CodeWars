// Limit string length - 1
// 7kyu
// https://www.codewars.com/kata/5208fc3cb613bc725f000142/train/javascript
// 2022-07-21 T:07:37:43#

function solution(string, limit) {
    return string.length <= limit ? string : string.substring(0, limit) + '...';
}

console.log(solution('Test', 8))