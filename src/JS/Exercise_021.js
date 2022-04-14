
// USD => CNY
// 7kyu
// https://www.codewars.com/kata/5977618080ef220766000022/train/javascript
// 2022-03-23 T:21:51:41
function usdcny(usd) {
    return toRound(usd * 6.75) + " Chinese Yuan"
}

function toRound(num){
    return (Math.round(num * 100) / 100).toFixed(2);
}

console.log(usdcny(15))