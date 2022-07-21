// List to Array
// 7kyu
// https://www.codewars.com/kata/557dd2a061f099504a000088/train/javascript
// 2022-07-21 T:07:26:02

function listToArray(list) {
    const arr = [];
    let head = list;

    while (head !== null) {
        arr.push(head.value);
        head = head.next;
    }
    return arr;
}

console.log(listToArray({value: 1, next: {value: 2, next: {value: 3, next: null}}}))

/*function listToArray(list) {
  var array = [];
  for (var node = list; node; node = node.next)
    array.push(node.value);
  return array;
}*/