package primus.pawel;

// Valid Phone Number
// 6kyu
// https://www.codewars.com/kata/525f47c79f2f25a4db000025/train/java
// 2021-08-27 T:14:15:03
class Exercise_203 {

    public static boolean validPhoneNumber(String phoneNumber) {
        String regExp = ("\\((\\d{3})\\)"+ " " + "\\d{3}" + "-" + "\\d{4}");
        return phoneNumber.matches(regExp);
    }

    public static void main(String[] args) {
        validPhoneNumber("(003) 123");
    }


}

/*^   - matches start of line
\(  - matches the character '('
\d  - matches any digit [0-9]
{x} - matches the previous exactly x times
\)  - matches the character ')'
' ' - matches the character ' '
'-' - matches the character '-'
$   - matches end of line*/