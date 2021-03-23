package primus.pawel;
//Complementary DNA
//7kyu
//https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java
//2021-03-22 T:19:33:04
class Exercise_033 {

    public static String makeComplement(String dna) {

        StringBuilder resultDNA = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {

            switch (dna.charAt(i)) {
                case 'A':
                    resultDNA.append('T');
                    break;
                case 'T':
                    resultDNA.append('A');
                    break;
                case 'C':
                    resultDNA.append('G');
                    break;
                case 'G':
                    resultDNA.append('C');
                    break;
            }

        }
        return resultDNA.toString();

    }

    public static void main(String[] args) {

    }
}
