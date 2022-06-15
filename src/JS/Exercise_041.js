
// Abbreviate a Two Word Name
// 8kyu
// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
// 2022-04-30 T:11:58:47

function abbrevName(name){
    var splited =  name.split(" ");
    return splited[0].charAt(0).toUpperCase() + "." + splited[1].charAt(0).toUpperCase();
}
