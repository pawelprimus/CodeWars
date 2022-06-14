
// All unique
// 7 kyu
//https://www.codewars.com/kata/553e8b195b853c6db4000048/train/javascript
// 2022-06-14 T:07:56:18

function hasUniqueChars(str){

    var unique = Array.from(str)
        .filter((v, i, a) => a.indexOf(v) === i);

    return unique.length == str.length
}


function uniq(a) {
    return a.sort(function (a, b) {
        return a - b;
    }).filter(function (item, pos, ary) {
        return !pos || item != ary[pos - 1];
    });
}

console.log(hasUniqueChars('abc'))
console.log(hasUniqueChars('abca'))

//let hasUniqueChars = (str) => new Set(str).size === str.length;