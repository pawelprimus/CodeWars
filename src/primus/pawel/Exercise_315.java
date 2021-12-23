package primus.pawel;

import java.util.Collections;

// Hide password from jdbc url
// 7kyu
// https://www.codewars.com/kata/5a726f16373c2ee6c60000db/train/java
// 2021-12-23 T:20:51:34
class Exercise_315 {

    public static String hidePasswordFromConnection(String urlString) {
        String password = "password=";
        String user = "&user=";
        int indexOfPassword = urlString.indexOf(password);
        int indexOfUser = urlString.indexOf(user);

        String firstPart;
        String secondPart;
        String thirdPart = "";

        if (indexOfUser > indexOfPassword) {
            firstPart = urlString.substring(0, indexOfPassword + password.length());
            secondPart = String.join("", Collections.nCopies(indexOfUser - firstPart.length(), "*"));
            thirdPart = urlString.substring(indexOfUser );
        } else {
            firstPart = urlString.substring(0, indexOfPassword + password.length());
            secondPart = String.join("", Collections.nCopies(urlString.length() - firstPart.length(), "*"));
        }

        String result = firstPart + secondPart + thirdPart;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=12345&user=root"));
    }

}
