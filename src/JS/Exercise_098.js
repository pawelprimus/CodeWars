
// How good are you really?
// 8 kyu
// https://www.codewars.com/kata/5601409514fc93442500010b/train/javascript
// 2022-06-06 T:08:30:45

function betterThanAverage(classPoints, yourPoints) {
    classPoints.push(yourPoints)
    return yourPoints > classPoints.reduce((sum, number) => sum + number, 0) / classPoints.length
}

console.log(betterThanAverage([100, 40, 34, 57, 29, 72, 57, 88], 75))