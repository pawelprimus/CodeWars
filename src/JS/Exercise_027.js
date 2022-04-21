
// Check same case
// 8kyu
// https://www.codewars.com/kata/5dd462a573ee6d0014ce715b/train/javascript
// 2022-04-20 T:23:24:46

function sameCase(a, b) {

    if (!isLetter(a) || !isLetter(b)) {
        return -1;
    }

    if (isLowerCase(a)) {
        return isLowerCase(b) ? 1 : 0;
    }
    return isLowerCase(b) ? 0 : 1;
}

function isLetter(c) {
    return c.toLowerCase() != c.toUpperCase();
}

function isLowerCase(str) {
    return str == str.toLowerCase() && str != str.toUpperCase();
}