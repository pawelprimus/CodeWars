
// Two Oldest Ages
// 7 kyu
// https://www.codewars.com/kata/511f11d355fe575d2c000001/train/javascript
// 2022-06-10 T:08:22:50

// return the two oldest/oldest ages within the array of ages passed in.
function twoOldestAges(ages){

    ages.sort((a, b) => a - b).reverse()
    return [ages[0] , ages[1]];
}

console.log(twoOldestAges([1,535,22,453,5345,6757]))

