// Dot Calculator
// 7 kyu
// 7kyu
// https://www.codewars.com/kata/6071ef9cbe6ec400228d9531/train/javascript
// 2022-06-23 T:07:57:27

function dotCalculator (equation) {
    var arr = equation.split(" ");

    switch (arr[1]){
        case "+" :
            return ".".repeat(arr[0].length + arr[2].length) ;
        case "-" :
            return ".".repeat(arr[0].length - arr[2].length)
        case "//" :
            return ".".repeat(arr[0].length / arr[2].length)
        case "*" :
            return ".".repeat(arr[0].length * arr[2].length)
    }
    return '';
}

function dotCounter(dots){
    
}