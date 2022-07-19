// Find the lucky numbers
// 7kyu
// https://www.codewars.com/kata/580435ab150cca22650001fb/train/javascript
// 2022-07-19 T:07:19:31

var filterLucky=x=>{
    return x.filter(i => String(i).includes('7'));
}