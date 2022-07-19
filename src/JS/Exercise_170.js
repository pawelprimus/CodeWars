// Numbers to Letters
// 7kyu
// https://www.codewars.com/kata/57ebaa8f7b45ef590c00000c/train/javascript
// 2022-07-19 T:07:12:37

function switcher(x) {
    return x.map(numberToChar).join("")
}

function numberToChar(nr) {
    var num = Number(nr);

    if (num === 27) return '!';
    if (num === 28) return '?';
    if (num === 29) return ' ';

    return String.fromCharCode((26 - nr) + 97);
}

console.log(switcher(['24', '12', '23', '22', '4', '26', '9', '8']))