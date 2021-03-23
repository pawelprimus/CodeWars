package primus.pawel;


class Exercise_012 {

    public static int persistence(long n) {

        int result =0;

        while (n > 9) {
            String number = Long.toString(n);
            //n=Character.getNumericValue(number.charAt(0));
            n = 1;
            for (int i = 0; i < number.length(); i++) {
                n *= Character.getNumericValue(number.charAt(i));
                //System.out.println(number.charAt(i));
            }
            result++;
            //System.out.println(n);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(persistence(39));

    }

}
