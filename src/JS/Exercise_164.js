// Sum of all arguments
// 7kyu
// https://www.codewars.com/kata/540c33513b6532cd58000259/train/javascript
// 2022-07-07 T:07:58:11
function sum(...args) {
    return args.reduce((a,b) => a+b ,0)
}