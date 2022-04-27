
// Stringy Strings
// 8kyu
// https://www.codewars.com/kata/563b74ddd19a3ad462000054/train/javascript
// 2022-04-27 T:19:40:04

function stringy(size) {
    var result = "";

    for (let i = 0; i < size; i++) {
        result += (i % 2 === 0 ) ? "1" : "0";
    }
    return  result;
}