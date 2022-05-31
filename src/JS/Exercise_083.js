// Drink about
// 8 kyu
// https://www.codewars.com/kata/56170e844da7c6f647000063/train/javascript
// 2022-05-31 T:18:58:46

function peopleWithAgeDrink(old) {

    if (old < 14) {
        return "drink toddy"
    }
    if (old < 18) {
        return "drink coke"
    }
    if (old < 21) {
        return "drink beer"
    }

    return "drink whisky"

};