
// Calculate average
// 8 kyu
// https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/javascript
// 2022-06-02 T:19:58:09

function find_average(array) {
    return array.length === 0 ? 0 : array.reduce((sum, number) => sum + number , 0) / array.length;
}

console.log(find_average([1,2,3,4]));