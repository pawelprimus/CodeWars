
// Ordered Count of Characters
// 7 kyu
// https://www.codewars.com/kata/57a6633153ba33189e000074/train/javascript
// 2022-06-15 T:07:43:07

var orderedCount = function (text) {

    var result = [];
    var charArr = Array.from(text);
    var map = new Map();
    for (const charArrElement of charArr) {
        if(map.has(charArrElement)){
            map.set(charArrElement, map.get(charArrElement) + 1)
        } else {
            map.set(charArrElement, 1)
        }
    }

    map.forEach((value, key, map) => {
        result.push([key, value])
    });

    return result;
}

console.log(orderedCount("abcdeee"))