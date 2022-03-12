
// Sum The Strings
// 8kyu
// https://www.codewars.com/kata/5966e33c4e686b508700002d/train/javascript
// 2022-03-10 T:22:19:31
function sumStr(a, b) {
    let numA;
    let numB;

    if(a.length !== 0){
        numA = parseInt(a)
    } else {
        numA = 0;
    }

    if(b.length !== 0){
        numB = parseInt(b)
    } else {
        numB = 0;
    }
    return numA + numB  + ""
}

console.log(sumStr("4", "5"));