
// Calculate BMI
// 8 kyu
// https://www.codewars.com/kata/57a429e253ba3381850000fb/train/javascript
// 2022-06-06 T:08:25:00

const UNDERWEIGHT = 'Underweight'
const NORMAL = 'Normal'
const OVERWEIGHT = 'Overweight'
const OBESE = 'Obese'

function bmi(weight, height) {
    const bmi = weight / Math.pow(height,2)

    if (bmi <= 18.5 ) return UNDERWEIGHT
    if (bmi <= 25.0 ) return NORMAL
    if (bmi <= 30.0 ) return OVERWEIGHT
    if (bmi > 30 ) return OBESE
}