package primus.pawel;

import java.util.ArrayList;

// Valid Braces
// 6kyu
// https://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java
// 2021-03-30 T:23:11:38
class Exercise_047 {

    public static boolean isValid(String braces) {

        if (braces.length() == 0) return false;
        if (braces.charAt(0) == ')' || braces.charAt(0) == '}' || braces.charAt(0) == ']') return false;
        ArrayList<Character> que = new ArrayList<>();

        for (int i = 0; i < braces.length(); i++) {

            if (braces.charAt(i) == '(' || braces.charAt(i) == '{' || braces.charAt(i) == '[')
                que.add(braces.charAt(i));
            else {
                if (que.size() == 0) return false;

                switch (braces.charAt(i)) {
                    case ')':
                        if (que.get(que.size() - 1) == '(') que.remove(que.size() - 1);
                        else return false;
                        break;
                    case '}':
                        if (que.get(que.size() - 1) == '{') que.remove(que.size() - 1);
                        else return false;
                        break;
                    case ']':
                        if (que.get(que.size() - 1) == '[') que.remove(que.size() - 1);
                        else return false;
                        break;
                    default:
                        return false;
                }
            }
        }
        return que.size() == 0;
    }

    public static void main(String[] args) {

        System.out.println(isValid("[(])"));

    }
}
