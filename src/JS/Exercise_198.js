// Find Duplicates
// 7kyu
// https://www.codewars.com/kata/5558cc216a7a231ac9000022/train/javascript
// 2022-08-13 T:14:18:20

function duplicates(arr) {
    var result = [];

    for (let i = 0; i < arr.length; i++) {

        for (let j = i - 1; j >= 0; j--) {

            if (arr[i] === arr[j]) {
                result.push(arr[i]);
                break;
            }
        }
    }

    return [...new Set(result)];
}

console.log(duplicates([1, 2, 4, 4, 3, 3, 1, 5, 3 ]))
