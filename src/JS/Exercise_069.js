
// Sum without highest and lowest number
// 8 kyu
// https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/javascript
// 2022-05-26 T:21:45:36

function sumArray(array) {
    if (array == null) {
        return 0;
    }

    if (array.length <= 2) {
        return 0;
    }

    var max_of_array = Math.max.apply(Math, array);
    var min_of_array = Math.min.apply(Math, array);

    return array.reduce((sum, num) => sum + num, 0) - max_of_array - min_of_array;
}

console.log(sumArray([ -6, 20, -1, 10, -12 ])  , 3 )

//
// sumArray = a => a ? a.sort((x, y) => x - y).slice(1, -1).reduce((s, e) => s + e, 0) : 0
//
// function sumArray(array) {
//     return Array.isArray(array) && array.length > 1
//         ? array.reduce((s, n) => s + n, 0) - Math.min(...array) - Math.max(...array)
//         : 0
// }