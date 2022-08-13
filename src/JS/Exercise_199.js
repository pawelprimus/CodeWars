// Move 10
// 7kyu
// https://www.codewars.com/kata/57cf50a7eca2603de0000090/train/javascript
// 2022-08-13 T:14:41:20

function moveTen(s) {
    return [...s].map(i => moveCharTen(i)).join('')
}

function moveCharTen(char) {
    var nr = char.charCodeAt(0);
    if(char === 'p'){
        return 'z'
    }
    return String.fromCharCode((nr - 96 + 10) % 26 + 96)
}


console.log(moveCharTen('p'))
console.log(moveTen('exampletesthere'))