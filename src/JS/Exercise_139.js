// Numbers in strings
// 7 kyu
// https://www.codewars.com/kata/59dd2c38f703c4ae5e000014
// 2022-06-20 T:20:35:54

function solve(s) {

    return Math.max(
        ...s.replace(/[^0-9]+/g, ' ')
        .split(' ')
        .map(i => Number(i)))
};

console.log(solve("gh12cdy695m1"))