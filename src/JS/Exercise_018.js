
// Find the Remainder
// 8kyu
// https://www.codewars.com/kata/524f5125ad9c12894e00003f/train/javascript
// 2022-03-16 T:00:16:16
function remainder(n, m){
    if(n > m){
        return m != null ? n%m : Nan;

    } else {
        return n != null ? m%n : Nan;
    }
}

console.log(remainder(17, 5))

/*function remainder(a, b){
  // Divide the larger argument by the smaller argument and return the remainder
  var min = Math.min(a,b);
  var max = Math.max(a,b);

  return min ? max % min : NaN;
}
*/