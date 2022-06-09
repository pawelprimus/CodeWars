
// Remove the minimum
// 7kyu
// https://www.codewars.com/kata/563cf89eb4747c5fb100001b/train/javascript
// 2022-06-09 T:08:06:47

function removeSmallest(numbers) {
    if (numbers == null) {
        return [];
    }
    var result = []
    var isAdded = false;
    var minNumber = Math.min(...numbers);
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] === minNumber) {
            if (!isAdded) {
                isAdded = true
            } else {
                result.push(numbers[i])
            }

        } else {
            result.push(numbers[i])
        }
    }

    return result;
}
