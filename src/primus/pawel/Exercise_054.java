package primus.pawel;

// Detect Pangram
// 6kyu
// https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java
// 2021-04-02 T:23:03:38
class Exercise_054 {
    public static boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] charFlags = new boolean[26];

        for (char c : sentence.toCharArray()) {
            if ((int) c >= 97 && (int) c <= 122) {
                charFlags[(int) c - 97] = true;
            }
        }

        for (boolean charFlag : charFlags) {
            if (!charFlag) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        check("Aaaaa");
    }
}


/*public boolean check(String sentence){
    return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
  }*/