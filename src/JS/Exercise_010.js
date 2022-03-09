// Hex to Decimal
// 8kyu
// https://www.codewars.com/kata/57a4d500e298a7952100035d/train/javascript
// 2022-03-09 T:01:44:53

function hexToDec(hexString) {
    hexString = hexString.toString(16);
    hexString = parseInt(hexString, 16);
    return hexString;
}

console.log(hexToDec("FF"));
