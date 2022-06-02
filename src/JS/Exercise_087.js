
// Welcome
// 8 kyu
// https://www.codewars.com/kata/577ff15ad648a14b780000e7/train/javascript
// 2022-06-01 T:20:12:44



function greet(language) {

    const map = new Map();
    map.set('english', 'Welcome')
    map.set('czech', 'Vitejte')
    map.set('danish', 'Velkomst')
    map.set('dutch', 'Welkom')
    map.set('estonian', 'Tere tulemast')
    map.set('finnish', 'Tervetuloa')
    map.set('flemish', 'Welgekomen')
    map.set('french', 'Bienvenue')
    map.set('german', 'Willkommen')
    map.set('irish', 'Failte')
    map.set('italian', 'Benvenuto')
    map.set('latvian', 'Gaidits')
    map.set('lithuanian', 'Laukiamas')
    map.set('polish', 'Witamy')
    map.set('spanish', 'Bienvenido')
    map.set('swedish', 'Valkommen')
    map.set('welsh', 'Croeso')

    return map.has(language) === true ? map.get(language) : 'Welcome';
}

/*function greet(lang) {
  return langs[lang]||langs['english'];
}

var langs = {
'english': 'Welcome',
'czech': 'Vitejte',
'danish': 'Velkomst',
'dutch': 'Welkom',
'estonian': 'Tere tulemast',
'finnish': 'Tervetuloa',
'flemish': 'Welgekomen',
'french': 'Bienvenue',
'german': 'Willkommen',
'irish': 'Failte',
'italian': 'Benvenuto',
'latvian': 'Gaidits',
'lithuanian': 'Laukiamas',
'polish': 'Witamy',
'spanish': 'Bienvenido',
'swedish': 'Valkommen',
'welsh': 'Croeso'
};
*/