
// Convert an array of strings to array of numbers
// 7 kyu
// https://www.codewars.com/kata/5783d8f3202c0e486c001d23/train/javascript
// 2022-06-15 T:07:41:18

function toNumberArray(stringarray){
    return stringarray.map(x => Number(x))
}

/*function toNumberArray(stringarray)
{
  return stringarray.map(parseFloat);
}*/