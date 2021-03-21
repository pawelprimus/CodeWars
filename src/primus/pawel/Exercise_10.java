package primus.pawel;
//https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java


class Exercise_10 {

    public static String accum(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            //System.out.println(Character.toUpperCase(s.charAt(i)));
            result += (Character.toUpperCase(s.charAt(i)));
            for (int j = (s.length() -i ); j < s.length(); j++) {
                //System.out.println(Character.toLowerCase(s.charAt(i)));
                result += Character.toLowerCase(s.charAt(i));
            }
            result+= "-";
        }

        return result.substring(0, result.length() - 1);

    }

    public static void main(String[] args) {


        System.out.println(accum("Abcd"));

    }

}

/*    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            builder.append(Character.toUpperCase(ch));
            for (int j = 0; j < i; j++) {
                builder.append(ch);
            }
            builder.append("-");
        }

        return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
    }*/