
// Beginner - Reduce but Grow
// 8 kyu
// https://www.codewars.com/kata/57f780909f7e8e3183000078/train/javascript
// 2022-05-26 T:21:57:33

function grow(x){
    return x.reduce((sum, num) => sum*num, 1)
}

console.log(grow([1, 2, 3]))