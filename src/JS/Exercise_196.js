// ASCII letters from Number
// 7kyu
// https://www.codewars.com/kata/589ebcb9926baae92e000001/train/javascript
// 2022-08-10 T:08:06:20

function convert(number) {
    var toAsci = '';
    var result = '';
    for (let i = 0; i < number.length; i++) {
        toAsci += number.charAt(i);
        if (i % 2 === 1) {
            result += String.fromCharCode(toAsci);
            toAsci = '';
        }
    }
    return result;
}

console.log(convert('73327673756932858080698267658369'))