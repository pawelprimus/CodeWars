// Get the integers between two numbers
// 7kyu
// https://www.codewars.com/kata/598057c8d95a04f33f00004e/train/javascript
// 2022-07-14 T:06:56:57

function range(startNum, endNum)
{
    return Array.from({length: endNum - startNum -1}, (x, i) => i + startNum + 1);
};

console.log(range(2,9))

