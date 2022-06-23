// Game Hit the target
// 7 kyu
// https://www.codewars.com/kata/5ffc226ce1666a002bf023d2/train/javascript
// 2022-06-23 T:08:08:48

const solution = mtrx => {

    console.log(mtrx)
    var x_X
    var y_X
    var x_Arrow
    var y_Arrow


    for (let i = 0; i < mtrx.length; i++) {
        for (let j = 0; j < mtrx[i].length; j++) {
            console.log(mtrx[i][j])
            if (mtrx[i][j].includes("x")) {
                x_X = j;
                y_X = i;
            } else if (mtrx[i][j].includes(">")) {
                x_Arrow = j;
                y_Arrow = i;
            }
        }
    }

    if (y_X === y_Arrow) {
        return x_X > x_Arrow
    }
    return false;
}

solution([
    [' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' '],
    [' ', ' ', '>', ' ', 'x'],
    [' ', ' ', '', ' ', ' ']
]);