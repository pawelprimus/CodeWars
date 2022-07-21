// Return String of First Characters
// 7kyu
// https://www.codewars.com/kata/5639bdcef2f9b06ce800005b/train/javascript
// 2022-07-21 T:07:20:15
function makeString(s){
    return s.split(' ').map(i => i.charAt(0)).join();
}
