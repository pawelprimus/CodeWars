// Sort by Last Char
// 7kyu
// https://www.codewars.com/kata/57eba158e8ca2c8aba0002a0/train/javascript
// 2022-07-19 T:07:03:08

function last(x) {
    return x.split(' ').sort(compareByFirstChar);
}

function compareByFirstChar(a, b) {
    return a.charCodeAt(a.length - 1) - b.charCodeAt(b.length - 1)
}

console.log(last('man i need a taxi up to ubud'));
