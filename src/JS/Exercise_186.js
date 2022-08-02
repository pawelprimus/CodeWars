// Basic Math (Add or Subtract)
// 7kyu
// https://www.codewars.com/kata/5809b62808ad92e31b000031/train/javascript
// 2022-08-02 T:07:30:19

function calculate(str) {

    var numbers = str.split(/[^\d.]/).filter(n => n).map(Number);
    var operators = str.split(/\d/).filter(n => n);

    var result = numbers[0]

    for (let i = 0; i < operators.length; i++) {
        if(operators [i] === 'plus'){
            result += numbers[i+1]
        } else {
            result -= numbers[i+1]
        }
    }

    return result.toString();
}

console.log(calculate('1plus2plus3minus4'));