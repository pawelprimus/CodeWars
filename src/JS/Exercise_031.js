
// Gravity Flip
// 8kyu
// https://www.codewars.com/kata/5f70c883e10f9e0001c89673/train/javascript
// 2022-04-24 T:18:58:06

const flip = (d, a) => {
    console.log(a)
    return d === 'R' ?
        Array.from(a).sort((a, b) => a - b) :
        Array.from(a).sort((a, b) => a - b).reverse();
}

console.log(flip('L', [ 13, 2, 4, 7, 93 ]));