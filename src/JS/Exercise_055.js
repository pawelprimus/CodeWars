
// Add new item (collections are passed by reference)
// 8kyu
// https://www.codewars.com/kata/566dc05f855b36a031000048/train/javascript
// 2022-05-23 T:18:41:19

function addExtra( listOfNumbers , newItem ){
    let newArray = Array.from(listOfNumbers);
    newArray.push(newItem);
    return newArray;
}

console.log(addExtra([1,2], 1))