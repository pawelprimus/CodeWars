// Find the smallest integer in the array
// 8kyu
// https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
// 2022-04-12 T:19:42:50

class SmallestIntegerFinder {
    findSmallestInt(args) {
        args.sort((a, b) => a - b)
        return args[0];
    }
}

let sif = new SmallestIntegerFinder();
console.log(sif.findSmallestInt([34, -345, -1, 100]))

/*class SmallestIntegerFinder {
  findSmallestInt(args) {
    return Math.min(...args)
  }
}
*/