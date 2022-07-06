// Even or Odd - Which is Greater?
// 7kyu
// https://www.codewars.com/kata/57f7b8271e3d9283300000b4/train/javascript
// 2022-07-06 T:21:39:05

function evenOrOdd(str) {

    var mappedArr = str.split("").map(i => Number(i));
    var even = mappedArr.filter(i => i % 2 === 0).reduce((a,b) => a + b , 0)
    var odd = mappedArr.filter(i => i % 2 !== 0).reduce((a,b) => a + b , 0)

    if (even === odd) {
        return "Even and Odd are the same";
    }
    return even > odd ? "Even is greater than Odd" : "Odd is greater than Even";
}

console.log(evenOrOdd("12313"));