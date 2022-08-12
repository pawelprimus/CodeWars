// Unique Sum
// 7kyu
// https://www.codewars.com/kata/56b1eb19247c01493a000065/train/javascript
// 2022-08-12 T:21:52:20

function uniqueSum(lst) {

    if (lst == null || lst.length === 0) {
        return null;
    }

    uniq = [...new Set(lst)];
    return uniq.reduce((num, sum) => sum + num, 0);
}

console.log(uniqueSum([]))
