package primus.pawel;

// Quicksum
// 7kyu
// https://www.codewars.com/kata/569924899aa8541eb200003f/train/java
// 2022-04-05 T:00:19:31
class Exercise_409 {

    public int quicksum(String packet) {

        char[] charArray = packet.toCharArray();
        char loopChar;
        int quickSum = 0;
        for (int i = 0; i < charArray.length; i++) {
            loopChar = charArray[i];
            if ((Character.isLetter(loopChar) && Character.isUpperCase(loopChar)) || loopChar == ' ') {
                if (loopChar != ' ') {
                    quickSum += (i + 1) * ((int) loopChar - 64);
                }

            } else {
                return 0;
            }

        }

        return quickSum;
    }

}
