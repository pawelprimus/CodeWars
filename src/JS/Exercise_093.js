
// FIXME: Replace all dots
// 8 kyu
// https://www.codewars.com/kata/596c6eb85b0f515834000049/train/javascript
// 2022-06-02 T:20:09:01

var replaceDots = function(str) {
    // added the \ to escape special characters
    // added the g so that replace is run for all occurences in the string
    return str.replace(/\./g, '-');
}

console.log(replaceDots("one.two.three"))