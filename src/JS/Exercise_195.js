// Find the Missing Number
// 7kyu
// https://www.codewars.com/kata/57f5e7bd60d0a0cfd900032d/train/javascript
// 2022-08-10 T:07:57:44

function missingNo(nums) {

    var arr = new Array(101).fill(false);

    for (const num of nums) {
        arr[num] = true;
    }
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === false) {
            return i
        }
    }
    return -1;
}

let arr1 = [9, 45, 53, 10, 100, 30, 85, 72, 69, 93, 98, 27, 73, 82, 91, 60, 5, 79, 88, 18, 71, 36, 44, 22, 89, 40, 59, 80, 81, 67, 25, 54, 13, 64, 56, 39, 48, 92, 84, 94, 87, 90, 77, 63, 32, 68, 37, 96, 23, 0, 95, 1, 52, 78, 6, 57, 50, 2, 46, 19, 76, 47, 14, 4, 3, 29, 17, 11, 21, 24, 74, 65, 12, 83, 28, 41, 66, 7, 58, 55, 51, 43, 97, 42, 86, 49, 31, 20, 75, 70, 34, 33, 38, 8, 15, 62, 35, 61, 99, 16] // 26

console.log(missingNo(arr1))

