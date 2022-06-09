
// Sort Numbers
// 7kyu
// https://www.codewars.com/kata/5174a4c0f2769dd8b1000003/train/javascript
// 2022-06-09 T:08:03:01

function solution(nums){
    if(nums == null){
        return []
    }
    return nums.sort((a,b) => a -b)
}

console.log(solution([1,5,6,3]))