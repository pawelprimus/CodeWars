
// Short Long Short
// 8kyu
// https://www.codewars.com/kata/50654ddff44f800200000007/train/javascript
// 2022-04-20 T:23:35:04
function solution(a, b) {
    return a.length > b.length ?
        b.concat(a).concat(b) :
        a.concat(b).concat(a);
}
