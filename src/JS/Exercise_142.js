// Interview Question (easy)
// 7 kyu
// https://www.codewars.com/kata/5b358a1e228d316283001892/train/javascript
// 2022-06-20 T:20:46:45

function getStrings(city) {

    var chars = city.replace(/\s/g, '').split("");
    const map = new Map();

    for (const char of chars) {
        const loopChar = char.toLowerCase();
        if (map.has(loopChar)) {
            map.set(loopChar, map.get(loopChar) + 1)
        } else {
            map.set(loopChar, 1)
        }
    }

    var result = "";
    for (const mapElement of map) {

        result += mapElement[0] + ":" + "*".repeat(mapElement[1]) + ","
    }

    return result.slice(0, result.length - 1);
}

function greet(language) {


    return map.has(language) === true ? map.get(language) : 'Welcome';
}

console.log(getStrings('Chicago'))
console.log(getStrings('Las Vegas Neg'))