// Evens times last
// 7 kyu
// https://www.codewars.com/kata/5a1a9e5032b8b98477000004/train/javascript
// 2022-06-20 T:20:49:56

function evenLast(numbers) {
    if(numbers.length === 0){
        return 0;
    }
    var lastNumber = numbers[numbers.length -1];
    var result = numbers[0] * lastNumber;

    for (let i = 1; i < numbers.length; i++) {
        if(i%2 === 0){
            result += numbers[i]*lastNumber
        }
    }
    return result;
}

evenLast([1, 3, 3, 1, 10])