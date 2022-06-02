
// Dollars and Cents
// 8 kyu
// https://www.codewars.com/kata/55902c5eaa8069a5b4000083/train/javascript
// 2022-05-31 T:19:11:09

function formatMoney(amount){
    return "$" + parseFloat(amount).toFixed(2)
}

/*
function formatMoney(amount){
  const usd = new Intl.NumberFormat('en-US', {
    style: 'currency',
    currency: 'USD',
    minimumFractionDigits: 2,
    useGrouping: false
  });
  return usd.format(amount);
}

*/