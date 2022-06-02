
// Invert values
// 8 kyu
// https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/javascript
// 2022-06-02 T:19:53:35

function invert(array) {
    return array.map(i => i * (-1));
}

console.log(invert([1,-2,3,-4,5]))