// Divide and Conquer
// 7kyu
// https://www.codewars.com/kata/57eaec5608fed543d6000021/train/javascript
// 2022-06-29 T:08:37:05

function divCon(x) {
    var intSum = 0;
    var stringsSum = 0;

    for (const x1 of x) {

        if (typeof x1 == 'number') {
            intSum += x1
        } else {
            stringsSum += Number(x1)
        }
    }

    return intSum - stringsSum;
}