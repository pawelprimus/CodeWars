package primus.pawel;
// Simple bead count
// 7kyu
// https://www.codewars.com/kata/58712dfa5c538b6fc7000569/train/java
// 2021-09-09 T:18:44:02
class Exercise_209 {

    public static int countRedBeads(final int nBlue) {
        if(nBlue<2){
            return 0;
        }
        return (nBlue-1)*2;
    }

}
