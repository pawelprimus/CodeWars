// Say hello!
// 7kyu
// https://www.codewars.com/kata/55955a48a4e9c1a77500005a/train/javascript
// 2022-07-23 T:11:35:53

function greet(name) {
    if(name == null || name.length < 1){
        return null;
    }
    return "hello " + name + "!"
}

function greet(name) {
    return name ? 'hello ' + name + '!' : null;
}