// Elevator Distance
// 7kyu
// https://www.codewars.com/kata/59f061773e532d0c87000d16/train/javascript
// 2022-07-06 T:21:36:11

function elevatorDistance(array) {
    var totalDistance = 0;
    for (let i = 1; i < array.length; i++) {
        totalDistance += Math.abs(array[i] - array[i - 1]);
    }
    return totalDistance
}