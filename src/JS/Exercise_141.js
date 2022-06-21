// Sum of numerous arguments
// 7 kyu
// https://www.codewars.com/kata/55c5b03f8c28da9a51000045/train/javascript
// 2022-06-20 T:20:46:08

function findSum(...numbers) {
    if (numbers == null) {
        return 0;
    }
    if (numbers.filter(i => i < 0).length > 0) {
        return -1;
    }

    return numbers.reduce((sum, num) => sum + num, 0)
}


console.log(findSum(1, -2, 4))

/*function findSum(...numbers){
  if (numbers.length == 0) return 0
  if (numbers.some(number => number < 0)) return -1
  return numbers.reduce((sum, curr) => sum + curr, 0)
}*/