
// Will there be enough space?
// 8 kyu
// https://www.codewars.com/kata/5875b200d520904a04000003/train/javascript
// 2022-05-30 T:22:52:18

function enough(cap, on, wait) {
    var space = cap - on - wait;

    return space >= 0 ? 0 : space * (-1);
}

/*
function enough(cap, on, wait) {
  return Math.max(wait + on - cap, 0);
}
*/