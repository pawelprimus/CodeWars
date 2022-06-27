// Ce*s*r*d Strings
// 7kyu
// https://www.codewars.com/kata/5ff6060ed14f4100106d8e6f/train/javascript
// 2022-06-27 T:08:14:27
function uncensor(infected, discovered) {
    var charArr = discovered.split("")
    for (const charArrElement of charArr) {
        infected = infected.replace('*', charArrElement)
    }
    return infected;
}

console.log(uncensor('*h*s *s v*ry *tr*ng*', 'Tiiesae', 'This is very strange'))