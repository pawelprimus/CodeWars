
// Are You Playing Banjo?
// 8 kyu
// https://www.codewars.com/kata/53af2b8861023f1d88000832/train/javascript
// 2022-05-26 T:21:53:17

function areYouPlayingBanjo(name) {
    // Implement me
    return name.charAt(0).toUpperCase() === 'R' ? name + " plays banjo" : name + " does not play banjo";
}