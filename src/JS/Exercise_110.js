
// Friend or Foe?
// 7 kyu
// https://www.codewars.com/kata/55b42574ff091733d900002f/train/javascript
// 2022-06-07 T:07:49:02

function friend(friends){
    return friends.filter(i => i.length === 4)
}

friend(["Ryan", "Jimmy", "123", "4", "Cool Man"])