package primus.pawel;

// Acronym Generator
// 7kyu
// https://www.codewars.com/kata/576a599359b11651bc00040e/train/java
// 2022-01-08 T:18:24:46
class Exercise_334 {
    public static String createAcronym(String lastName, String firstName) {
        String[] full = (firstName + " " + lastName).split("[-\\s]");
        StringBuilder result = new StringBuilder();
        for (String word : full) {
            if (word.equalsIgnoreCase("von")) {
                result.append("v");
            } else {
                result.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        createAcronym("Meyer-Schmidt", "Paul");
    }
}
