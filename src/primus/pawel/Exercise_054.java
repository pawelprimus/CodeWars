package primus.pawel;

//
//
//
// 2021-04-02 T:23:03:38
class Exercise_054 {
    public static boolean check(String sentence) {
        sentence =  sentence.toLowerCase();
        boolean[] charFlags = new boolean[26];

        for (char c : sentence.toCharArray()) {

            if ((int) c >= 97 && (int) c <= 122) {
                charFlags[(int) c - 97] = true;
            }
        }

        for (int i = 0; i < charFlags.length; i++) {
            if (charFlags[i] == false) return false;
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