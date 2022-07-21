// Odder Than the Rest
// 7kyu
// https://www.codewars.com/kata/5983cba828b2f1fd55000114/train/javascript
// 2022-07-21 T:08:06:15

function oddOne(arr) {
    for (let i = 0; i < arr.length; i++) {
        if (Math.abs(arr[i]) % 2 === 1) return i
    }
    return -1;
}


console.log(oddOne([4,-8,98,-12,-7,90,100]))
