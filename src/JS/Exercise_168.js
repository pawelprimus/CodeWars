// How many are smaller than me?
// 7kyu
// https://www.codewars.com/kata/56a1c074f87bc2201200002e/train/javascript
// 2022-07-14 T:07:12:30
function smaller(nums) {

    var result = [];
    var biggerCounter = 0;
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[j] < nums[i]) {
                biggerCounter++;
            }
        }
        result.push(biggerCounter)
        biggerCounter = 0;
    }
    return result;
}

console.log(smaller([5, 4, 3, 2, 1]))