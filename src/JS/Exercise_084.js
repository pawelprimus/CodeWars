// Multiplication table for number
// 8 kyu
// https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/javascript
// 2022-05-31 T:19:04:25

function multiTable(number) {
    var result = "";
    for (let i = 1; i <= 9; i++) {
        result += i + " * " + number + " = " + number * i + "\n";
    }
    result += 10 + " * " + number + " = " + number * 10;

    return result;
}

console.log(multiTable(5))

/*const multiTable = (number) => {
  let table = '';

  for(let i = 1; i <= 10; i++) {
    table += `${i} * ${number} = ${i * number}${i < 10 ? '\n' : ''}`;
  }

  return table;
}
*/