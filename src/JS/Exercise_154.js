// Case Swapping
// 7kyu
// https://www.codewars.com/kata/5590961e6620c0825000008f/train/javascript
// 2022-07-01 T:07:33:20

function swap(str) {
    var result = "";

    var chars = str.split("");

    for (const char of chars) {

        console.log(char);

        if (isLowerCase(char)) {
            result += char.toUpperCase()
        } else {
            result += char.toLowerCase()
        }
    }
    return result;
}

function isLowerCase(character) {
    return (character === character.toLowerCase())
}

console.log(swap("a B1"))