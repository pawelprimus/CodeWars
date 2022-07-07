// Product of Array Items
// 7kyu
// https://www.codewars.com/kata/5901f361927288d961000013/train/javascript
// 2022-07-07 T:07:43:35

function product(values) {
    if(values == null || values.length === 0 ){
        return null;
    }
    return values.reduce((a,b) => a*b , 1);
}

console.log(product([5, 4, 1, 3, 9]));