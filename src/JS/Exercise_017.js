// Is it a palindrome?
// 8kyu
// https://www.codewars.com/kata/57a1fd2ce298a731b20006a4/train/javascript
// 2022-03-14 T:22:57:57
function isPalindrome(x) {

    const charArr = Array.from(x);
    const LENGTH = charArr.length;
    for (let i = 0; i < LENGTH; i++) {
        if (charArr[i].toLowerCase() !== charArr[LENGTH - i - 1].toLowerCase()) {
            return false;
        }
    }
    return true;
}

console.log(isPalindrome("Abcd"))