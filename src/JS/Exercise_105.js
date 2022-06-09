
// Find the vowels
// 7kyu
// https://www.codewars.com/kata/5680781b6b7c2be860000036/train/javascript
// 2022-06-09 T:07:44:24

function vowelIndices(word) {
    var indexesOfVowels = []
    var chars = Array.from(word)
    for (let i = 0; i < chars.length; i++) {
        if(isVowel(chars[i])){
            indexesOfVowels.push(i + 1)
        }
    }
    return indexesOfVowels
}

function isVowel(char) {
    const VOWELS = 'aeiouy'
    return VOWELS.includes(char.toLowerCase())
}


