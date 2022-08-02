// Array2Binary addition
// 7kyu
// https://www.codewars.com/kata/559576d984d6962f8c00003c/train/javascript
// 2022-08-02 T:08:09:13

function arr2bin(arr) {
    for (const arrElement of arr) {
        if (arrElement === true || !isNumber(arrElement) || arrElement.length === 0) {
            return false
        }
    }
    return arr.reduce((num, sum) => sum + num, 0).toString(2);
}

function isNumber(c) {
    return c !== " " && !isNaN(Number(c));
}

function arr2bin(a) {
    if (a.some((x) => typeof x != "number"))
        return false;
    return a.reduce((a, b) => a + b, 0).toString(2);
}