// Frequency sequence
// 7kyu
// https://www.codewars.com/kata/585a033e3a36cdc50a00011c/train/javascript
// 2022-07-14 T:06:46:58

function freqSeq(str, sep) {

    var occMap = new Map();

    str.split('').forEach(i => {
            if (occMap.has(i)) {
                occMap.set(i, occMap.get(i) + 1)
            } else {
                occMap.set(i, 1)
            }
        }
    )
    return str.split('').map(i => occMap.get(i)).join(sep);
}

console.log(freqSeq('hello world', '-'))