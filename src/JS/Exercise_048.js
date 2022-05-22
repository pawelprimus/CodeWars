
// Removing Elements
// 8kyu
// https://www.codewars.com/kata/5769b3802ae6f8e4890009d2/train/python
// 2022-05-21 T:12:34:06

function removeEveryOther(arr){
    var newArr = [];
    for (let i = 0; i < arr.length; i++) {
        if(i%2 === 0){
            newArr.push(arr[i]);
        }
    }
    return newArr;
}

console.log(removeEveryOther([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))