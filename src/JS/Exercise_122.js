
// Leap Years
// 7 kyu
// https://www.codewars.com/kata/526c7363236867513f0005ca/train/javascript
// 2022-06-13 T:07:40:35

function isLeapYear(year) {
    if (year % 4 !== 0) {
        return false
    }
    return !(year % 100 === 0 && year % 400 !== 0);
}