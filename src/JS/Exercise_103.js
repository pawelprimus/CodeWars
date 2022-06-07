
// Categorize New Member
// 7 kyu
// https://www.codewars.com/kata/5502c9e7b3216ec63c0001aa/train/javascript
// 2022-06-07 T:08:00:06

function openOrSenior(data){
    return data.map(i => singleOpenOrSenior(i))
}

function singleOpenOrSenior(data){
    return data[0] >= 55 && data[1] > 7 ? 'Senior' : 'Open'
}

console.log(openOrSenior([[45, 12],[55,21],[19, -2],[104, 20]]))