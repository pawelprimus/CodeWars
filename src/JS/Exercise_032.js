// Total amount of points
// 8kyu
// https://www.codewars.com/kata/5bb904724c47249b10000131/train/javascript
// 2022-04-24 T:19:06:31
function points(games) {
    var points = 0;
    for (const game of games) {
        var number_1 = game.split(":")[0]
        var number_2 = game.split(":")[1]

        if (number_1 === number_2) {
            points++;
        } else {
            points += number_1 > number_2 ? 3 : 0;
        }
    }
    return points;
}

points(["0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"])