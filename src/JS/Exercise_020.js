
// Beginner - Lost Without a Map
// 8kyu
// https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java
// 2022-03-23 T:21:45:38

function maps(x) {
    let arr = Array.from(x)
    let doubleArray = new Array();

    for (let i = 0; i < arr.length; i++) {
        doubleArray[i] = arr[i]*2;

    }
    return doubleArray;
}

//function maps(x){
//   return x.map(n => n * 2);
// }