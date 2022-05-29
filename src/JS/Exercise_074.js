
// Palindrome Strings
// 8 kyu
// https://www.codewars.com/kata/57a5015d72292ddeb8000b31/train/javascript
// 2022-05-28 T:12:20:55

function isPalindrome(line) {

    let lineStr = line.toString();

    for (let i = 0; i < lineStr.length / 2; i++) {
        if (lineStr.charAt(i) !== lineStr.charAt(lineStr.length - i -1)) {
            return false;
        }
    }
    return true;
}

console.log(isPalindrome(123456))

/*function isPalindrome(line) {
  return (line.toString() == line.toString().split('').reverse().join(''));
}
*/