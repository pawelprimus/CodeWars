// Initialize my name
// 7 kyu
// https://www.codewars.com/kata/5768a693a3205e1cc100071f/train/javascript
// 2022-06-20 T:20:45:51

function initializeNames(name) {
    var names = name.split(' ');


    if (names.length <= 2) {
        return name;
    }
    var result = names[0] + ' ';

    for (let i = 1; i < names.length - 1; i++) {
        result += names[i].charAt(0).toUpperCase() + '. ';
    }
    result += names[names.length - 1];
    return result;
}

console.log(initializeNames('Alice Betty Catherine Davis'))