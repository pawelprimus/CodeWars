
// Find the capitals
// 7 kyu
// https://www.codewars.com/kata/539ee3b6757843632d00026b/train/javascript
// 2022-06-12 T:11:44:52

var capitals = function (word) {

    var charArr = word.split('');
    var result = [];
    for (let i = 0; i < charArr.length; i++) {

        if (charArr[i] == charArr[i].toUpperCase()) {
            result.push(i)
        }
    }
    return result;
};

capitals("CodEWaRs")