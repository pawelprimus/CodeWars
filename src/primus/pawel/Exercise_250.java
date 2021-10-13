package primus.pawel;
// Break camelCase
// 6kyu
// https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
// 2021-10-13 T:19:15:53
class Exercise_250 {

    public static String camelCase(String input) {

        if(input.equals(null) || input.length() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))){
                sb.append(" ");
            }
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

}
