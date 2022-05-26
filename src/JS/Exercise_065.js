
// Area or Perimeter
// 8kyu
// https://www.codewars.com/kata/5ab6538b379d20ad880000ab
// 2022-05-25 T:21:48:13

const areaOrPerimeter = function (l, w) {
    return l === w ? l * w : 2 * l + 2 * w
};