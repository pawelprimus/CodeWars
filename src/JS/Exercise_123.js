// Boiled Eggs
// 7 kyu
// https://www.codewars.com/kata/52b5247074ea613a09000164/train/javascript
// 2022-06-13 T:07:45:58

function cookingTime(eggs) {
    return Math.ceil(eggs / 8) * 5;
}

console.log(cookingTime(10))