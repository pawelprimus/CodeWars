
// Check the exam
// 7 kyu
// https://www.codewars.com/kata/5a3dd29055519e23ec000074/train/javascript
// 2022-06-12 T:13:08:25

function checkExam(array1, array2) {
    var resultPoints = 0;

    for (let i = 0; i < array1.length; i++) {

        if (array2[i] != '') {
            if (array1[i] === array2[i]) {
                resultPoints += 4;
            } else {
                resultPoints -= 1;
            }
        }
    }

    return resultPoints > 0 ? resultPoints : 0;
}

console.log(checkExam(["b", "c", "b", "a"], ["",  "a", "a", "c"]))