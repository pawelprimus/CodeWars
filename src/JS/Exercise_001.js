
// Hello, Name or World!
// 8kyu
// https://www.codewars.com/kata/57e3f79c9cb119374600046b/train/javascript
// 2022-03-01 T:20:13:07

const HI = "Hello, "

function hello(name) {

    if(name == null || name.length === 0){
        return "Hello, World!"
    }

    return HI + name[0].toUpperCase() + name.toLowerCase().substr(1) + "!";
}

console.log(hello("John"))