
// Grasshopper - Personalized Message
// 8 kyu
// https://www.codewars.com/kata/5772da22b89313a4d50012f7/train/javascript
// 2022-06-06 T:08:39:11

function greet (name, owner) {
    return  name === owner ? 'Hello boss': 'Hello guest';
}

console.log(greet('Daniel', 'Daniel'))//function greet (name, owner) {
//   return `Hello ${name==owner?'boss':'guest'}`
// }

