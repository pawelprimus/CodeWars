// Pillars
// 8kyu
// https://www.codewars.com/kata/5bb0c58f484fcd170700063d/train/javascript
// 2022-03-14 T:21:53:11

function pillars(num_pill, dist, width) {
    return num_pill <= 1 ? 0 :
        (num_pill - 1) * (dist * 100) + (num_pill - 2) * width;
}

console.log(pillars(2, 20, 25))

