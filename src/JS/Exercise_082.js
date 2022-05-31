// Triple Trouble
// 8 kyu
// https://www.codewars.com/kata/5704aea738428f4d30000914/train/javascript
// 2022-05-31 T:18:54:19

function tripleTrouble(one, two, three){
    var result = "";

    for (let i = 0; i < one.length; i++) {
        result += one.charAt(i);
        result += two.charAt(i);
        result += three.charAt(i);
    }

    return result;
}