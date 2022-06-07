
// Vowel Count
// 7 kyu
// https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/javascript
// 2022-06-07 T:07:34:34

const VOWELS = 'aeiou'

function getCount(str) {
    return Array.from(str).filter(i => VOWELS.includes(i) === true).length
}

console.log(getCount('abcde'))