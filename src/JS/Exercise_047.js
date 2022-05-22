
// Name Shuffler
// 8kyu
// https://www.codewars.com/kata/559ac78160f0be07c200005a/train/javascript
// 2022-05-21 T:12:16:43

function nameShuffler(str) {
    let arr = str.split(" ");
    return arr[1] +" "+ arr[0];
}