
// Sum Mixed Array
// 8kyu
// https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/javascript
// 2022-05-24 T:22:05:04
//

function sumMix(x){
    return x.map(a => +a).reduce((a, b) => a + b);
}
// function sumMix(x) {
//     var sum = 0;
//     for (const x1 of x) {
//         sum += Number(x1)
//     }
//     return sum
// }
console.log(sumMix([1, 2, '1']));

