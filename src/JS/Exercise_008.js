// Sentence Smash
// 8kyu
// https://www.codewars.com/kata/53dc23c68a0c93699800041d/train/java
// 2022-03-07 T:23:35:53

function smash(words) {
    var result = "";

    for (let word of words) {

        result += word + " ";
    }

    return result.trim();
};

console.log(smash(["this", "is", "a", "really", "long", "sentence"]));


/*smash = function (words) {
  return words.join(" ");
};*/
