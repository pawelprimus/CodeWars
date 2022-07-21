// Find the calculation type
// 7kyu
// https://www.codewars.com/kata/5aca48db188ab3558e0030fa/train/javascript
// 2022-07-21 T:07:43:38

function calcType(a, b, res) {
    if (a + b === res) return 'addition'
    if (a - b === res) return 'subtraction'
    if (a * b === res) return 'multiplication'
    return 'division'
}