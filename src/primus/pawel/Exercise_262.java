package primus.pawel;
// Kooka-Counter
// 7kyu
// https://www.codewars.com/kata/58e8cad9fd89ea0c6c000258/train/java
// 2021-10-31 T:11:20:13
class Exercise_262 {

    private static final String MALE = "Ha";
    private static final String FEMALE = "ha";


    public static int kookaCounter(final String laughing) {

        if(laughing.length()<2){
            return 0;
        }
        String current2letters = String.valueOf(laughing.charAt(0)) + String.valueOf(laughing.charAt(1));
        String lookingFor ;
        if(current2letters.equals(MALE)){
            lookingFor = FEMALE;
        } else {
            lookingFor = MALE;
        }

        int counter = 1;
        for (int i = 1; i < laughing.length()-1; i++) {
            current2letters = String.valueOf(laughing.charAt(i)) + String.valueOf(laughing.charAt(i+1));

            if(current2letters.equals(lookingFor)){
                counter ++;
                if(current2letters.equals(MALE)){
                    lookingFor = FEMALE;
                } else {
                    lookingFor = MALE;
                }
            }

        }

        return counter;
    }

    public static void main(String[] args) {

        System.out.println(kookaCounter("hahahahaha"));
        System.out.println(kookaCounter("hahahahahaHaHaHa"));
        System.out.println(kookaCounter("HaHaHahahaHaHa"));

    }

}
