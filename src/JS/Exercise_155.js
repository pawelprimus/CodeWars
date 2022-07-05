// Help Bob count letters and digits.
// 7kyu
// https://www.codewars.com/kata/5738f5ea9545204cec000155/train/javascript
// 2022-07-05 T:08:30:14

function countLettersAndDigits(input) {

    var result = 0;

    for (const inputElement of input.split("")) {
        if (isLetter(inputElement) || isNumber(inputElement)) {
            result++;
            console.log(inputElement)
        }
    }

    return result;
}

function isLetter(c) {
    return c.length === 1 && c.match(/[a-z]/i);
}

function isNumber(c) {
    return c !== " " && !isNaN(Number(c));
}

console.log(countLettersAndDigits("j3d'>q/nvYRzk{=^WtN@1 v@~hWh l<~I>p-5| +jm?\\&}M~+Z"))
