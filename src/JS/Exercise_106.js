
// Find the divisors!
// 7kyu
// https://www.codewars.com/kata/544aed4c4a30184e960010f4/train/javascript
// 2022-06-09 T:07:53:12

function divisors(integer) {
    console.log(integer)
    var arrayOfDivisors = [];
    for (let i = 2; i < integer / 2 + 1 ; i++) {
        if(integer % i === 0){
            arrayOfDivisors.push(i)
        }
    }
    return arrayOfDivisors.length === 0 ? integer + ' is prime' : arrayOfDivisors;
};

console.log(divisors(12))