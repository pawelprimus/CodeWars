
// What is between?
// 8kyu
// https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/javascript
// 2022-03-03 T:00:13:30

function between(a, b) {
    var resultArray = [];
    for (let i = a; i <= b; i++) {
        resultArray.push(i);
    }
    return resultArray;
}

console.log(between(1, 20));
