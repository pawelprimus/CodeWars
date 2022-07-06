// Numerical Palindrome #1
// 7kyu
// https://www.codewars.com/kata/58ba6fece3614ba7c200017f/train/javascript
// 2022-07-06 T:21:11:40

const NOT_VALID = "Not valid"

function palindrome(num) {
    if(num< 0 || typeof num == 'string'){
        return NOT_VALID;
    }
    const charArr = Array.from(String(num));
    const LENGTH = charArr.length;
    for (let i = 0; i < LENGTH; i++) {
        if (charArr[i].toLowerCase() !== charArr[LENGTH - i - 1].toLowerCase()) {
            return false;
        }
    }
    return true;
}
