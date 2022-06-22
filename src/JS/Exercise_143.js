// Double Sort
// 7 kyu
// https://www.codewars.com/kata/57cc79ec484cf991c900018d
// 2022-06-20 T:20:48:23

function dbSort(a) {
    var numbers = [];
    var strings = [];

    for (const i of a) {
        if (typeof i === 'number') {
            numbers.push(i)
        } else {
            strings.push(i)
        }
    }
    numbers.sort((a, b) => a - b);
    strings.sort()
    var result = Array.prototype.concat.apply(numbers, strings);

    return result;
}


dbSort(["Apple", 46, "287", 574, "Peach", "3", "69", 78, "Grape", "423"])