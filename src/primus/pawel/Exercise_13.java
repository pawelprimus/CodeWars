package primus.pawel;
//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
class Exercise_13 {

    public static String highAndLow(String numbers) {

        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        numbers += " ";
        StringBuilder sB = new StringBuilder("");

        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ' ') {
                //System.out.println("");
                // System.out.println(sB.toString());
                if (Integer.parseInt(sB.toString()) < lowest) {
                    lowest = Integer.parseInt(sB.toString());
                }
                if (Integer.parseInt(sB.toString()) > highest) {
                    highest = Integer.parseInt(sB.toString());
                }
                sB.delete(0, sB.length());
            } else {
                //System.out.print(numbers.charAt(i));
                sB.append(numbers.charAt(i));
            }
        }
        //System.out.println(highest);
        //System.out.println(lowest);
        return highest + " " + lowest;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
