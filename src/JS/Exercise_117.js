
// The Coupon Code
// 7 kyu
// https://www.codewars.com/kata/539de388a540db7fec000642/train/javascript
// 2022-06-12 T:12:07:52

function checkCoupon(enteredCode, correctCode, currentDate, expirationDate) {
    if (enteredCode !== correctCode) {
        return false;
    }

    currentDateArr = currentDate.split(" ");
    expirationDateArr = expirationDate.split(" ");

    currentDateParsed = new Date(currentDateArr[2], getMonthIndex(currentDateArr[0]), currentDateArr[1].replace(',', '',))
    expirationDateParsed = new Date(expirationDateArr[2], getMonthIndex(expirationDateArr[0]), expirationDateArr[1].replace(',', '',), 0)


    return currentDateParsed <= expirationDateParsed;
}


function getMonthIndex(monthName) {
    var monthNames = ['January', 'February', 'Marz', 'April', 'May', 'June',
        'July', 'August', 'September', 'October', 'November', 'December'];

    for (let i = 0; i < monthNames.length; i++) {
        if (monthName == monthNames[i]) {
            return i;
        }
    }
    return -1
}

//checkCoupon('123', '123', 'January 5, 2014', 'October 1, 2014')
console.log(checkCoupon('12abcd3', '12abcd3', 'January 5, 2014', 'January 1, 2014'))

/*function checkCoupon(enteredCode, correctCode, currentDate, expirationDate){
  return enteredCode === correctCode && Date.parse(expirationDate) >= Date.parse(currentDate)
}*/