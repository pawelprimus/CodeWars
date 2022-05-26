
// Basic Mathematical Operations
// 8 kyu
// https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/javascript
// 2022-05-26 T:21:37:32

function basicOp(operation, value1, value2) {
    switch (operation) {
        case '+':
            return value1 + value2;
        case '-':
            return value1 - value2;
        case '*':
            return value1 * value2;
        case '/':
            return value1 / value2;
        default:
            return 0;
    }

}