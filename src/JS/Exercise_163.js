// Merge two arrays
// 7kyu
// https://www.codewars.com/kata/583af10620dda4da270000c5/train/javascript
// 2022-07-07 T:07:50:32
function mergeArrays(a, b) {

    var maxLength = Math.max(a.length, b.length);

    var result = [];

    for (let i = 0; i < maxLength; i++) {
        if(i < a.length){
            result.push(a[i])
        }
        if(i < b.length){
            result.push(b[i])
        }
    }
    return result;
}

console.log(mergeArrays([1, 2, 3, 4, 5, 6, 7, 8], ['a', 'b', 'c', 'd', 'e']))