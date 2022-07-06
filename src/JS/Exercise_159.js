// String matchup
// 7kyu
// https://www.codewars.com/kata/59ca8e8e1a68b7de740001f4/train/javascript
// 2022-07-06 T:21:25:57

function solve(a, b) {
    var resultArr = [];

    var counter = 0;
    for (let i = 0; i < b.length; i++) {
        for (const element of a) {
            if (b[i] === element) {
                counter++;
            }
        }
        resultArr.push(counter)
        counter = 0;
    }

    return resultArr;
}

console.log((solve(['abc', 'xyz', 'abc', 'xyz', 'cde'], ['abc', 'cde', 'xyz'])));