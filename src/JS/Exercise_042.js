
// Remove String Spaces
// 8kyu
// https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/javascript
// 2022-05-19 T:21:12:48

function noSpace(x){
    return x.split(' ').join('')
}

console.log(noSpace("ab cd"))