// Reversed Words
// 8kyu
// https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/javascript
// 2022-03-10 T:22:32:42

function reverseWords(str) {
    console.log(str)
    const wordsArr = str.split(" ")
    let result = "";
    for (var word of wordsArr.reverse()) {
        result = result + word + " ";
    }
    return result.trim();
}

console.log(reverseWords("yoda doesn't speak like this"))

//function reverseWords(str){
//   return str.split(' ').reverse().join(' ');
// }