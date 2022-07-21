// Substring fun
// 7kyu
// https://www.codewars.com/kata/565b112d09c1adfdd500019c/train/javascript
// 2022-07-21 T:07:32:41

function nthChar(words) {
    var result = '';

    for (let i = 0; i < words.length; i++) {
        result += words[i][i]
    }
    return result;
}

/*function nthChar(words){
 return words.map((str, i) => str.charAt(i)).join("");
}*/