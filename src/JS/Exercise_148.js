// Multiply Word in String
// 7kyu
// https://www.codewars.com/kata/5ace2d9f307eb29430000092/train/javascript
// 2022-08-14 T:11:23:48


function modifyMultiply (str,loc,num) {
    var arr = str.split(' ');
    var wordToRepeat = arr[loc];
    return (wordToRepeat + '-').repeat(num - 1) + wordToRepeat
}