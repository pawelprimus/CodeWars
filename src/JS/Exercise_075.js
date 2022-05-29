
// Remove duplicates from list
// 8 kyu
// https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118/train/javascript
// 2022-05-28 T:12:28:46

function distinct(a) {
    return [...new Set(a)];
}