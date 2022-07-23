// Making Copies
// 7kyu
// https://www.codewars.com/kata/53d2697b7152a5e13d000b82/train/javascript
// 2022-07-23 T:11:30:08

function copyList(l) {
    return l.map(x => x);
}

console.log(copyList([1, 2, 3, 4]))

/*function copyList(l) {
  return l.slice();
}
*/