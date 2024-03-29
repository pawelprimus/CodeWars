
// Filter out the geese
// 8kyu
// https://www.codewars.com/kata/57ee4a67108d3fd9eb0000e7
// 2022-03-07 T:23:41:53

function gooseFilter(birds) {
    var geese = ["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"];

    var resultArray = [];

    for (let bird of birds) {

        if (!geese.includes(bird)) {
            resultArray.push(bird)
        }
    }

    return resultArray;
};

gooseFilter(["Mallard", "Barbary", "Hook Bill", "Blue Swedish", "Crested"]);

//function gooseFilter (birds) {
//   var geese = ["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"];
//   return birds.filter(b => !geese.includes(b));
// };
