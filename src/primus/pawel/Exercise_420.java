package primus.pawel;

// Help Suzuki rake his garden!
// 7kyu
// https://www.codewars.com/kata/571c1e847beb0a8f8900153d/train/java
// 2022-04-14 T:18:54:56
class Exercise_420 {

    private static final String GRAVEL = "gravel";
    private static final String ROCK = "rock";

    public static String rakeGarden(String garden) {
        String[] words = garden.split("\\s");
        StringBuilder result = new StringBuilder();
        for (String word : words) {

            if (word.equals(GRAVEL) || word.equals(ROCK)) {
                result.append(word).append(" ");
            } else {
                result.append(GRAVEL).append(" ");
            }
        }


        return result.toString().trim();
    }

}
