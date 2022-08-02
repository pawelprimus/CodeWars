// Find all occurrences of an element in an array
// 7kyu
// https://www.codewars.com/kata/59a9919107157a45220000e1/train/javascript
// 2022-08-02 T:07:55:56

const findAll = (array, n) => {
    var result = [];

    for (let i = 0; i < array.length; i++) {

        if (array[i] === n) {
            result.push(i)
        }
    }
    return result;
}

/*const findAll = (array, n) => {
  let a = []; array.forEach((v,i)=>{if(v===n){a.push(i)}})
  return a
}*/