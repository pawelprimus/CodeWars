// Least Larger
// 7kyu
// https://www.codewars.com/kata/5f8341f6d030dc002a69d7e4/train/javascript
//  2022-08-08 T:21:34:47

function leastLarger(a,i) {
    var lookingForNumber = a[i];
    var minLarger = Number.MAX_VALUE;
    var resultIndex = -1;

    for (let j = 0; j < a.length; j++) {

        if(a[j] > lookingForNumber){
            if(a[j] < minLarger){
                resultIndex = j;
                minLarger = a[j];
            }
        }
    }
    return resultIndex;
}

console.log(leastLarger( [4, 1, 3, 5, 6], 0 ))