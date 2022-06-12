
// Power of two
// 7 kyu
// https://www.codewars.com/kata/534d0a229345375d520006a0/train/javascript
// 2022-06-12 T:13:15:45

function isPowerOfTwo(n){
    if(n == 0){
        return false
    }
    if(n == 1){
        return true
    }
    return !String(toBinary(n)).slice(1).includes('1')
}

function toBinary(n){
    return n.toString(2) ;
}

/*
function isPowerOfTwo(n){
    return Number.isInteger(Math.log2(n));

}
*/


