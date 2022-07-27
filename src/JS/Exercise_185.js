// Consecutive Vowels
// 7kyu
// https://www.codewars.com/kata/62a933d6d6deb7001093de16/train/javascript
// 2022-07-27 T:07:41:55

const INVALID = 'Invalid word'
const VOWELS = 'aeiouAEIOU'

function i(word) {
    if (word == null || word.length === 0) {
        return INVALID;
    }

    var firstChar = word.charAt(0);

    if (!isLetter(firstChar) || isLowerCase(firstChar) || firstChar === 'I') {
        return INVALID;
    }

    const vowels = howManyVowels(word)
    const consonants = word.length - vowels;

    if(consonants <= vowels){
        return INVALID;
    }

    return 'i' + word;
}

function isLetter(c) {
    return c.toLowerCase() != c.toUpperCase();
}

function isLowerCase(str) {
    return str == str.toLowerCase() && str != str.toUpperCase();
}

function howManyVowels(word) {
    return word.split('')
        .map(i => isVowel(i) ? i : '')
        .join('')
        .length
}


function isVowel(char) {
    return VOWELS.includes(char.toLowerCase())
}

console.log(i('Peace'))
