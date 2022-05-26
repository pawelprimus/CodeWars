
// If you can't sleep, just count sheep!!
// 8kyu
// https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/javascript
// 2022-05-21 T:12:49:59

var sheep = " sheep..."

var countSheep = function (num) {
    var result = "";
    for (let i = 1; i <= num; i++) {
        result += i + sheep;
    }
    return result
}
console.log(countSheep(10))