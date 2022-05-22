
// Find Multiples of a Number
// 8kyu
// https://www.codewars.com/kata/58ca658cc0d6401f2700045f/train/javascript
// 2022-05-21 T:12:42:27
function findMultiples(integer, limit) {
    var array = [];
    var number= integer;
    var multiplier = 1;

    while (number * multiplier <= limit){
        array.push(number * multiplier);
        multiplier++;
    }

    return array;
}

// function findMultiples(int,limit){
//     return Array(Math.floor(limit/int)).fill(1).map((x,i)=>int*(i+1));
// }