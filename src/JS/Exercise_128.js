
// Sum of Odd Cubed Numbers
// 7 kyu
// https://www.codewars.com/kata/580dda86c40fa6c45f00028a/train/javascript
// 2022-06-14 T:08:03:11

function cubeOdd(arr) {
    var result = 0;

    for (const arrElement of arr) {
        if (typeof arrElement == 'number') {
            if (arrElement % 2 !== 0) {
                result += Math.pow(arrElement, 3)
            }
        } else {
            return undefined
        }
    }

    return result;
}

console.log(cubeOdd([1, 2, 3, 4]))

/*let cubeOdd = a => {
  var isNumeric = a.every(x=>!isNaN(x))
  return isNumeric ? a.filter(n=>n%2).reduce((s,n)=>s+(n*n*n),0) : undefined
}*/