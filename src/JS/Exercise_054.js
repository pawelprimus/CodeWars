
// Merge two sorted arrays into one
// 8kyu
// https://www.codewars.com/kata/5899642f6e1b25935d000161/train/javascript
// 2022-05-23 T:18:08:19

function mergeArrays(arr1, arr2) {
    return uniq(Array.from(arr1).concat(arr2));
}

function uniq(a) {
    return a.sort(function (a, b) {
        return a - b;
    }).filter(function (item, pos, ary) {
        return !pos || item != ary[pos - 1];
    });
}

console.log(mergeArrays([1, 3, 5, 7, 9, 11, 12], [1, 2, 3, 4, 5, 10, 12]))

/*function mergeArrays(arr1, arr2) {
  return Array.from(new Set(arr1.concat(arr2).sort((a,b) => (a-b))));
}*/