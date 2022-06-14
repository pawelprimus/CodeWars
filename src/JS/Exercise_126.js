
// Remove anchor from URL
// 7 kyu
// https://www.codewars.com/kata/51f2b4448cadf20ed0000386/train/javascript
// 2022-06-14 T:07:51:18

const ANCHOR = "#"
function removeUrlAnchor(url){
    let indexOfAnchor = url.indexOf(ANCHOR)
    return indexOfAnchor >= 0 ? url.slice(0, indexOfAnchor) : url
}

console.log(removeUrlAnchor('www.codewars.com#about'))
console.log(removeUrlAnchor('www.codewars.com/katas/'))