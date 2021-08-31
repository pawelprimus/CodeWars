package primus.pawel;

// THe speed of Letters
// 7kyu
// https://www.codewars.com/kata/5fc7caa854783c002196f2cb/train/java
// 2021-08-31 T:20:43:22
class Exercise_204 {
    public static String speedify(final String input) {
        StringBuilder sbResult = new StringBuilder();
        sbResult.append(" ".repeat(input.length() + 26));

        Character currentLoopCharacter;
        for (int i = 0; i < input.length(); i++) {
            currentLoopCharacter = input.charAt(i);
            //sbResult.replace(i - 1 + valueOfLetter(currentLoopCharacter), i + valueOfLetter(currentLoopCharacter), currentLoopCharacter.toString());
            //sbResult.setCharAt(i - 1 + valueOfLetter(currentLoopCharacter), currentLoopCharacter);
            sbResult.setCharAt(i - 1 + currentLoopCharacter - 64, currentLoopCharacter);
        }
        return sbResult.toString().stripTrailing();
        //return sbResult.toString().replaceAll("\\s+$", "");
    }

    public static int valueOfLetter(Character character) {
        return (int) Character.toUpperCase(character) - 64;
    }

    public static void main(String[] args) {
         //System.out.println(valueOfLetter('C'));
        System.out.println(speedify("CBA"));
    }
}
