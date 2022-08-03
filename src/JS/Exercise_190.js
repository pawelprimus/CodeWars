// Odd Ones Out!
// 7kyu
// https://www.codewars.com/kata/5d376cdc9bcee7001fcb84c0/train/javascript
// 2022-08-03 T:07:51:19

function oddOnesOut(nums) {

    var occ = new Map();
    for (const num of nums) {

        if (occ.has(num)) {
            occ.set(num, occ.get(num) + 1)
        } else {
            occ.set(num, 1)
        }
    }

    var resultArray = [];

    for (const num of nums) {
        if (occ.get(num) % 2 === 0) {
            resultArray.push(num)
        }
    }
    return resultArray;
}

console.log(oddOnesOut([1, 2, 3, 1, 3, 3]))