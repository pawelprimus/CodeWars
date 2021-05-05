package primus.pawel;
// count the digit
// 7kyu
// https://www.codewars.com/kata/566fc12495810954b1000030/train/java
// 2021-05-04 T:23:42:04
class Exercise_106 {

    public static int nbDig(int n, int d) {
        StringBuilder sb = new StringBuilder();
        int sum = 0 ;
        for (int i = 0; i <= n; i++) {
            sb.append(i*i);
        }
        for (int j = 0; j < sb.length(); j++) {
            if(Character.getNumericValue(sb.charAt(j)) == (d)){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(nbDig(5750, 0));
    }
}
