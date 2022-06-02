
// No zeros for heros
// 8 kyu
// https://www.codewars.com/kata/570a6a46455d08ff8d001002/train/javascript
// 2022-05-28 T:12:31:58

function noBoringZeros(n) {
    return Number(n.toString().replace(/^0+(\d)|(\d)0+$/gm, '$1$2'));
}

console.log(noBoringZeros(13000))