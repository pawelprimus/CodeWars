
// Counting sheep...
// 8 kyu
// https://www.codewars.com/kata/54edbc7200b811e956000556/train/javascript
// 2022-05-25 T:23:44:44

function countSheeps(arrayOfSheep) {
    return arrayOfSheep.filter(i => i === true).length;
}