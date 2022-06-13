
// Love vs friendship
// 7 kyu
// https://www.codewars.com/kata/59706036f6e5d1e22d000016/train/javascript
// 2022-06-13 T:07:49:08

function wordsToMarks(string) {
    return Array.from(String(string))
        .map(i => i.toLowerCase().charCodeAt(0) - 96)
        .reduce((sum, num) => sum + num, 0)
}

console.log(wordsToMarks("aBc"))