// Word to binary
// 7kyu
// https://www.codewars.com/kata/59859f435f5d18ede7000050/train/javascript
// 2022-08-13 T:14:41:20

function wordToBin(str) {
    return [...str].map(i => charToBinary(i));
}

function charToBinary(char) {

    var nr = char.charCodeAt(0);
    return '0' + nr.toString(2);
}

console.log(charToBinary('A'))
console.log(wordToBin('AB'))
