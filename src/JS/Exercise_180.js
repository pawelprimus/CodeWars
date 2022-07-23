// Return the Missing Element
// 7kyu
// https://www.codewars.com/kata/5299413901337c637e000004/train/javascript
// 2022-07-23 T:11:25:19

function getMissingElement(superImportantArray){
    for (let i = 0; i <= 9; i++) {
        if(!superImportantArray.includes(i)){
            return i;
        }
    }
    return -1;
}