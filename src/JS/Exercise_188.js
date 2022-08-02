// Consecutive letters
// 7kyu
// https://www.codewars.com/kata/5ce6728c939bf80029988b57/train/javascript
// 2022-08-02 T:08:02:29

function solve(s) {
    var asciChars = s.split('').map(i => i.charCodeAt(0)).sort((a , b) => a - b )
    for (let i = 1; i < asciChars.length; i++) {
        if (asciChars[i] !== asciChars[i - 1] + 1) {
            return false;
        }
    }
    return true;
}

console.log(solve('dabc'))