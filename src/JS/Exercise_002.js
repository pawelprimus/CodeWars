// Powers of 2
// 8kyu
// https://www.codewars.com/kata/57a083a57cb1f31db7000028/train/javascript
// 2022-03-01 T:20:24:07

function powersOfTwo(n) {
    var number = 1;
    const result = [];
    result[0] = 1;
    for (let i = 1; i <= n; i++) {
        number = number * 2;
        result[i] = number;
    }
    return result;
}

console.log(powersOfTwo(3))

/*function powersOfTwo(n){
  var result = [];
  for (var i = 0; i <= n; i++) {
    result.push(Math.pow(2, i));
  }
  return result;
}*/